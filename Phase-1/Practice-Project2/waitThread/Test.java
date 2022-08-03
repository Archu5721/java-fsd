package waitThread;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method starts!!");
		waitDemo wt = new waitDemo();
		Thread t = new Thread(wt);
		t.setName("W");
		t.start();
		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(tname + ": Notified");
			System.out.println(tname + ": Total:" +wt.getTotal());
		}
		System.out.println(tname + ": Main method Ends");
	}
}
