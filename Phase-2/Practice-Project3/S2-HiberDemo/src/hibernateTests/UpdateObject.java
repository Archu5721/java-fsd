package hibernateTests;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class UpdateObject {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txt =  session.getTransaction();
		
		try {

			txt.begin();
			Message message = session.get(Message.class,3);
			System.out.println(message);
			message.setText("I am modified!!");
			txt.commit();
		}catch(Exception ex) {
			if (txt != null) {
				txt.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}

}
