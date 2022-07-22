package waitThread;

public class waitDemo implements Runnable{
	private int total;
	public int getTotal() {
		return total;
	}
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Calculation Begins!!");
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total += i;
			}
			System.out.println(tname + ": Calculation done!! notifying...");
			this.notify();
		}
		System.out.println(tname + ": Calculation ends!!");
		
	}

}
