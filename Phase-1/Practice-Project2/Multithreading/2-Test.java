package runDemo;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		runnableDemo rd = new runnableDemo();
		Thread t = new Thread(rd);
		t.setName("RD");
		t.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println(tname + ":" +i);
		}
	}
}
