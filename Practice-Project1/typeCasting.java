package javademo;

public class typeCasting {
	public static void main(String[] args) {
		int i1 = 10;
		byte b1 = 5;

		i1 = b1;
		System.out.println(b1);

		i1 = 20;
		b1 = 13;
		System.out.println(b1);
		b1 = (byte) i1;
		System.out.println(b1);
	}

}
