
public class innerClass {
	String name = "Meena";
	class Inner{
		void greet() {
			System.out.println("Hello " + name);
		}
	}
	public static void main(String[] args) {
		innerClass obj = new innerClass();
		innerClass.Inner in = obj.new Inner();
		in.greet();
	}
}
