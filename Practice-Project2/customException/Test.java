package customException;

public class Test {
	public static void main(String[] args) {
		try {
			throw new CustomDemo("Custom exception");
		}catch(CustomDemo e) {
			System.out.println(e.getMessage());
		}
	}
}
