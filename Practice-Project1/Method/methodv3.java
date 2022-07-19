//method overloading
public class methodv3 {
	int area(int length, int breadth ) {
		int result = length * breadth;
		return result;
	}
	int area (int side) {
		int result = side*side;
		return result;
	}
	public static void main(String[] args) {
		methodv3 obj = new methodv3();
		int rectangle_area=obj.area(10, 8);
		int square_area=obj.area(10);
		System.out.println("The area of rectangle :" + rectangle_area);
		System.out.println("The area of square :" + square_area);
	}
}
