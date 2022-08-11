package hibernateTests;
import org.hibernate.Session;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		//Message message = new Message("Hello world with Hibernate and annotations"); 
		Message message1 = new Message("Hello from India"); 
		
		//session.save(message);
		session.save(message1);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}
