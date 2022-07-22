package syncDemo;

public class DisplayMessage{
	public synchronized void sayHello(String name){
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.println(tname +":" +i+  " Hello " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
