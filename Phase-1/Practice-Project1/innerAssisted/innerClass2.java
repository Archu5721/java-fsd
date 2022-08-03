package innerAssisted;

public class innerClass2 {
	private String name="Meena";
	void display() {
		class Inner{
			void greet() {
				System.out.println("Hello!!" + name);
			}
		}
		Inner i = new Inner();
		i.greet();
	}
	public static void main(String[] args) {
		innerClass2 i2 = new innerClass2();
		i2.display();
	}
}
