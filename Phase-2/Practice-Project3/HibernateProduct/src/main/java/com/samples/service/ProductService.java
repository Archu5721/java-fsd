package com.samples.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Product;
import com.samples.utils.HibernateUtil;

public class ProductService {
	public void addProduct(Product product){

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			session.save(product);

			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	public List<Product> getProducts() {
		List<Product> products =null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			products = session.createQuery("from Product").list();

			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return products;
	}

}
