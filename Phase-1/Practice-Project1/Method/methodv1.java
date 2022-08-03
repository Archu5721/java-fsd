
public class methodv1 {
	int add(int a, int b) {
		int x = a + b;
		return x;
	}
	public static void main(String[] args) {
		methodv1 obj = new methodv1();
		int sum = obj.add(5, 5);
		System.out.println("The sum is :" + sum);
	}
}
