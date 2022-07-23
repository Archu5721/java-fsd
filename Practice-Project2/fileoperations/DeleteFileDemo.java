package fileoperations;

import java.io.File;

public class DeleteFileDemo {
	public static void main(String[] args) {
		File myFile = new File("Ex.txt");
		
		if(myFile.delete()) {
			System.out.println(myFile.getName() + " deleted Successfully");
		}
		else {
			System.out.println("Error occured");
		}
	}
}
