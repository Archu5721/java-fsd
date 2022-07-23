package fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) {
		String data = "Vanakkam";
		
		try {
			FileWriter file1 = new FileWriter("E:\\Javafsd\\Ex.txt");
			file1.write(data);
			System.out.println("Data is written");
			file1.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
