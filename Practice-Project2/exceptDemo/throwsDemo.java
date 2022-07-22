package exceptDemo;

public class throwsDemo {
	public static void main(String[] args) {
		int a=10,b=0;
		int c;
		throwsDemo td = new throwsDemo();
		try {
			td.division(a, b);
		}catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
			
		}finally {
		System.out.println("Program ended");
		}
	}
	int division(int a, int b) throws ArithmeticException {
		int result = a / b;
		return result;
	}
}
