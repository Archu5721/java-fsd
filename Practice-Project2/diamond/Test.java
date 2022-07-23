package diamond;

public class Test implements One,two{

	@Override
	public void display() {
		
		One.super.display();
		two.super.display();
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.display();
	}

}
