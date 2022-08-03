package innerAssisted;

public class innerClass3 {

	public static void main(String[] args) {
		anonymousInner i = new anonymousInner() {

			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		i.display();
	}
}
