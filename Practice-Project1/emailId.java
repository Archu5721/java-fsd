import java.util.*;

public class emailId {
	public static void main(String[] args) {
		String search;
		ArrayList<String> email = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		email.add("abc@gmail.com");
		email.add("a123@gmail.com");
		email.add("b123@gmail.com");
		email.add("c13@gmail.com");
		System.out.println(email);
		System.out.println("Enter the email id to be found: ");
		search = sc.nextLine();
		for(String value : email) {
			if(value.contains(search)) {
				System.out.println("The eamil id " + search + " is found");
			}
		}	
	}
}
