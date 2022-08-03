package exceptionDemo;

import java.util.Scanner;

public class nullDemo {
	public static void main(String[] args) {
		try {
		String str = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String :");
//		
//		str = sc.nextLine();
		System.out.println("Print Length:" + str.length());
		}
		catch(NullPointerException e) {
			System.out.println("String should not be null");
		}
		System.out.println("Program ended!!");
	}
}
