package exceptDemo;

import java.util.Scanner;

//import javax.management.RuntimeErrorException;

public class throwDemo {
	
	public static void main(String[] args) {
		int cost;
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount: ");
		amount = sc.nextInt();
		System.out.println("Cost: ");
		cost = sc.nextInt();
		throwDemo td =new throwDemo();
		try {
			td.buyProduct(amount,cost);
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Happy Shopping!!");
		}
		
		
	}
	void buyProduct(int amount,int cost) {
		if(amount<cost) {
			throw new RuntimeException("Can't buy the product");
		}
		else {
			System.out.println("Product bought by the customer");
		}
	}
}
