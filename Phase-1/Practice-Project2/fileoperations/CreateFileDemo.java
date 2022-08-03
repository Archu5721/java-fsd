package fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) {
		File file = new File("E:\\Javafsd\\Ex.txt");
		
		try {
			if (file.createNewFile()) {
				System.out.println("Created Successfully!!");
			}
			else {
				System.out.println("File Already Exists");
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
