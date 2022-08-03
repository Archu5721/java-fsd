package exceptionDemo;

import java.util.Scanner;

public class demoParser {
	public static void main(String[] args) {
		String str;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		int a = Integer.parseInt(str);
		System.out.println("result : " +a);
		}
		catch(NumberFormatException e){
			System.out.println("letters in string cannot be converted into int!!");
		}
		System.out.println("Program Ended!");
	
	}	
}
