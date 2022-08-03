package staticbinding;

public class compileTime {
	public static void main(String[] args) {
		compileTime ct = new compileTime();
		ct.area(9);
		ct.area(10, 5.8f);
	}
	
	void area(int side) {
		int result = side * side;
		
		System.out.println("Result " + result);
	}
	void area(int height,float breadth) {
		double result = 0.5 * (height * breadth);
		System.out.println("Result " + result);
	}
}
