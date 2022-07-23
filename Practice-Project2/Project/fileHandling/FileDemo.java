package fileHandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	void createFile() {
		File myFile = new File("Project-2.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File Created SuccessFully");
			}
			else {
				System.out.println("Already Exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void writeFile() {
		String data1 = "Hello!! HI!!!";
		try {
			FileWriter fw = new FileWriter("Project-2.txt");
			fw.write(data1);
			System.out.println("File is written successfully");
			fw.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	void readFile() {
		char[] data1 = new char[100];
		try {
			FileReader fr = new FileReader("Project-2.txt");
			fr.read(data1);
			System.out.println("File is read");
			System.out.println(data1);
		} catch (IOException e) {
			System.out.println("File Not found");
		}
	}
	
	void appendFile() {
		String add = "File Handling Demo";
		try {
			FileWriter myFile = new FileWriter("Project-2.txt",true);
			myFile.append(add);
			System.out.println("-----File SuccessFully Appended!!");
			myFile.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		fd.createFile();
		fd.writeFile();
		fd.readFile();
		fd.appendFile();
		fd.readFile();
	}
}
