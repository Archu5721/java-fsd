package Accessspecifiers;

class priaccess {
	private priaccess() {
		System.out.println("I am a private constructor");
	}
	private void method() {
		System.out.println("I am a private method ");
	}
	public static void main(String[] args) {
		priaccess p1 = new priaccess();
		p1.method();
	}
}
