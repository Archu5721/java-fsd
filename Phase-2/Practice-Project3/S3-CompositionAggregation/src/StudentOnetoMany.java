import org.hibernate.Session;
import org.hibernate.Transaction;


import com.samples.domain.Guide;
import com.samples.domain.Student;

import com.samples.utils.HibernateUtil;

public class StudentOnetoMany {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();

			Guide guide = new Guide("2000XYZ001", "Chrissy grey", 10000);
			Student student1 = new Student("SR004", "William", guide);
			Student student2 = new Student("SR005", "Carla", guide);
		
			
			guide.getStudent().add(student1);
			guide.getStudent().add(student2);
			
			session.persist(guide);

			
			
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