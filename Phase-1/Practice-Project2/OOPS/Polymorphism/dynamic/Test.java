package dynamic;

public class Test {
	public static void main(String[] args) {
//		MacBookPro pro = new MacBookPro();
//		pro.start();
//		pro.sleep();
//		funct(pro);
		MacBook mac = new MacBookPro();
		mac.start();
		mac.sleep();
		
		MacBook mac1 = new MacBookAir();
		mac1.start();
		mac1.sleep();
		
//		MacBookAir air = new MacBookAir();
//		air.start();
//		air.sleep();
//		funct(pro);
	}
	
//	static void funct(MacBook mac) {
//		mac.start();
//		mac.sleep();
//	}
}
