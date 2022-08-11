import org.hibernate.Session;
import org.hibernate.Transaction;


import com.samples.domain.Guide;
import com.samples.domain.Student;

import com.samples.utils.HibernateUtil;

public class StudentOneStudentTwoGuide {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Guide guide1 = new Guide("2000XYZ002", "Johnathan Murray", 15000);
			Guide guide2 = new Guide("2000XYZ003", "Johnathan Cavier", 1500);

			Student student1 = new Student("SR011", "Ariandra", guide1);
		
			

			
//			session.persist(guide1);
			session.persist(student1);

			
			
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