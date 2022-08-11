package hibernateTests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class DeleteObject {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txt =  session.getTransaction();
		
		try {

			txt.begin();
			Message message = session.get(Message.class,3);
			
			session.delete(message);
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
