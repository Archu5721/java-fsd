package syncDemo;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " Main  starts");
		
		DisplayMessage dm = new DisplayMessage();
		
		Thread t1= new Thread(new Worker(dm,"Mathi"));
		t1.setName("t1");
		
		Thread t2= new Thread(new Worker(dm,"Mathu"));
		t2.setName("t2");
		
		Thread t3= new Thread(new Worker(dm,"Mathy"));
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tname + " Main ends");
	}
}
