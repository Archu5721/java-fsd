package exceptionDemo;

public class demoArray {
	public static void main(String[] args) {
		//try {
			int arr[]= {10,20,10,30};
			try {
				System.out.println("Print :" + arr[4]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Couldn't handle");
			}
	}
}
