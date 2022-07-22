package exceptionDemo;

import java.util.Scanner;

public class divideByzero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		int result;
		System.out.println("Enter the numbers: ");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			result=a/b;
			System.out.println("The result is :" + result);
		}catch(ArithmeticException e) {
			System.out.println("Divide by Zero is an error");
		}
		System.out.println("Successfully program ended!!!");
	}
}
