package sleepDemo;

public class sleep extends Thread{
	public static void main(String[] args) {
		sleep sl = new sleep();
		sl.setName("Thread 1");
		sl.start();
		for(int i=1;i<=5;i++) {
			System.out.println(i +":Aria ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println(j + ":Hello!! ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
