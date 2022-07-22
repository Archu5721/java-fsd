package handlers;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("Try BLock");
			throw new HandlersDemo("Custom exception");
		}catch(HandlersDemo e) {
			System.out.println("Catch Block");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Program ended!!");
		}
	}
}
