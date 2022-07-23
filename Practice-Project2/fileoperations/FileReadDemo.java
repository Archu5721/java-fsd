package fileoperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		char[] data = new char[200];
		
		try {
			FileReader out = new FileReader("E:\\\\Javafsd\\\\Ex.txt");
			out.read(data);
			System.out.println("Data is received!!");
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
