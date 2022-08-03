package fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
	public static void main(String[] args) {
		String app = "India";
		
		try {
			FileWriter output = new FileWriter("E:\\\\Javafsd\\\\Ex.txt", true);
			output.append(app);
			System.out.println("File Successfully Appended!!");
			output.close();
		} catch (IOException e) {
			System.out.println("File Error");
		}
	}
}
