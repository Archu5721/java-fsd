package multi;



public class multiDemo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		multiDemo md = new multiDemo();
		md.setName("thee");
		md.start();
		//md.numbers();
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.print(tname + ": i: " + i + "\t");
			Thread.sleep(1000);
		}
	}
	
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int j=1;j<=10;j++) {
			System.out.print(tname + "j: " + j + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
//	void numbers() {
//		for(int k=0;k<=5;k++) {
//			System.out.print("k: " +k + "\t");
//		}
//	}
}
