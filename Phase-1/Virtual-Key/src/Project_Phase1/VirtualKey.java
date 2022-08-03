package Project_Phase1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VirtualKey {
	private static TreeSet<String> add;
	static Set<String> add1;
	static Set<String> add2;
	public static void main(String[] args) {
		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("\t VIRTUAL KEY FOR YOUR REPOSITORIES");
		System.out.println("\t\t -Developed By Archatha R");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
		System.out.println(" ");
		System.out.println(" ");
		optionsSelection();
		
	}		
	private static void optionsSelection() {
			add = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
			add.add("Example.txt");
			add.add("Project.pdf");
			add.add("User.txt");
			add.add("abc.txt");
	        String[] arr = {"1. Retrieving the file names in an ascending order",
	                "2. Business-level operations",
	                "3. close the application"};
	        int[] arr1 = {1,2,3};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	        }
	        Scanner sc = new Scanner(System.in);
	        System.out.println(" ");
	        System.out.println("-------------------------------------------");
	        System.out.println("Enter your Choice : ");
	        int option1 = sc.nextInt();
	        switch(option1) {
	     	      case 1: 
	     	        	System.out.println("Files in Ascending Order :" );
	     	        	//add.addAll(add1);
	     	        	Iterator<String> itr = add.iterator();
	     	        	while(itr.hasNext()) {
	     	        		System.out.print(itr.next() + "   ");
	     	        	}
	     	        	System.out.println(" ");
	     	        	System.out.println(" ");
	     	        	optionsSelection();
	     	        	break;
	     	      case 2: 
	     	        	optionSelection2();
	     	        	break;
	     	      case 3: 
	     	        	closeApp();
	     	        	break;
	     	      default: 
	     	        	System.out.println("Enter correct option :(");
	     	        	System.out.println(" ");
	     	        	optionsSelection();
	     	            break;
	     	        
	     	}
	}
	
	static void optionSelection2() {
		add1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		add2 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		System.out.println(" ");
		String[] arr1 = {"1. Add a user specified file to the application",
                "2. Delete a user specified file from the application",
                "3. Search a user specified file from the application",
                "4. Back to main menu"};
        int[] arr11 = {1,2,3,4};
        int  slen = arr11.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr1[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Enter your Choice : ");
        int option1 = sc.nextInt();
        switch(option1) {
     	case 1: 
     			Scanner sc1 = new Scanner(System.in);
     			System.out.println("Give the name of the file you wish to add : ");
     			String file = sc1.nextLine();
     			add1.add(file);
     			add.addAll(add1);
     			System.out.println(add);
    			System.out.println("File succsessfully added!!!");
    			System.out.println(" ");
     	        optionSelection2();
     	        break;
        case 2: 
        		Scanner sc2 = new Scanner(System.in);
    			System.out.println("Enter the file to be deleted : ");

    			String file1 =  sc2.nextLine();
    			if(add.contains(file1)) {
    				add.remove(file1);
    				System.out.println("File Successfully deleted!!");
    				System.out.println(add);
    			}
    			else {
    				System.out.println("File Not Found!!");
    			}
    			System.out.println(" ");
    			optionSelection2();
     	       	break;
     	case 3: 
     	       	System.out.println("Enter the file to be searched : ");
     	       	Scanner scanner = new Scanner(System.in);
     	       	String search = scanner.nextLine();
     	       	indexOf(add, search);
     	       	System.out.println(" ");
     	        optionSelection2();
     	       	break;
     	case 4:
     			System.out.println(" ");
     			System.out.println("------Welcome to the main menu------");
     			System.out.println(" ");
     			optionsSelection();
     			break;
     	default: 
     	       	System.out.println("Enter correct option :(");
     	       	System.out.println(" ");
     	       	optionSelection2();
     	       	break;
     	        
     	}	
	}

	private static int indexOf(TreeSet<String> set, String search) {

		int index = -1;
		if (add.contains(search)) {
			index = (set).headSet(search).size();
			System.out.println("File found");
		}
		else {
			System.out.println("File not found");
		}
		return index;
	}
	private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
	                
}
