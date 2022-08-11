import org.hibernate.Session;
import org.hibernate.Transaction;


import com.samples.domain.Guide;
import com.samples.domain.Student;

import com.samples.utils.HibernateUtil;

public class StudentCascade {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Guide guide = new Guide("2000ABC001", "Mike Lawson", 1000);
			Student student3 = new Student("SR003", "Will", guide);
		
			
			session.persist(student3);
			
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
	
}