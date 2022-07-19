import java.util.Scanner;
public class Calculator {
		public static void main(String[] args) {
			double result=0;
			double p,q;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number:");
			p=sc.nextInt();
			System.out.println("Enter the Second Number:");
			q=sc.nextInt();
			
			System.out.println("Enter: a for Addition \nEnter: b for Subtraction \nEnter: c for multiplication \nEnter: d for division");
			char operator=sc.next().charAt(0);
			switch(operator) {
			case 'a':
				result=p+q;
				break;
			case 'b':
				result=p-q;
				break;
			case 'c':
				result=p*q;
				break;
			case 'd':
				result=p/q;
				break;
			default:
				System.out.println("Enter valid operator");
				break;
			}
			System.out.println("The Result is :" + result);
			
		}
}
