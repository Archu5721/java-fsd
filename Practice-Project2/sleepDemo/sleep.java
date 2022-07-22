package sleepDemo;

public class sleep extends Thread{
	public static void main(String[] args) {
		sleep sl = new sleep();
		sl.setName("Thread 1");
		sl.start();
		for(int i=1;i<=5;i++) {
			System.out.print(i +":Aria ");
		}
	}
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.print(j + ":Hello!! ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
