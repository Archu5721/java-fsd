package Inheritance;

public class Dog extends Animals{
	String food;
	String breedName;
	Dog(String food,String breedName){
		super(4);
		this.food=food;
		this.breedName=breedName;
	}
	void display() {
		System.out.println("LegCount: " + legcount);
		System.out.println("Food: " + this.breedName);
		System.out.println("Breed: " + this.breedName);
	}
}
