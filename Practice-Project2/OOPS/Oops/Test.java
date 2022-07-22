package Oops;

public class Test {
	int age;
	String name;
	Test(int age,String name){
		this.age=age;
		this.name=name;
	}
	void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
