
public class methodv2 {
	int number=15;

	int operation(int val) {
		val =val*10;
		return(val);
	}

	public static void main(String args[]) {
		methodv2 obj = new methodv2();
		System.out.println("Before operation value of data is "+obj.number);
		obj.operation(100);
		System.out.println("After operation value of data is "+obj.number);
		}
	

	
}
