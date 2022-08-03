
public class DemoConstructors {
	int num;
	String name;
	DemoConstructors(int age,String name){
		System.out.println("I am a Demo Construtor");
		this.num=age;
		this.name=name;
	}
	//Default constructor
	DemoConstructors(){
		
	}
	void printInfo() {
		System.out.println("Name :" +this.name );
		System.out.println("Age : " +this.num );
	}
	public static void main(String[] args) {
		DemoConstructors d = new DemoConstructors();
		DemoConstructors demo = new DemoConstructors(20,"Daphne");
		DemoConstructors demo1 =  new DemoConstructors(30,"Antony");
		demo.printInfo();
		demo1.printInfo();
	}

}
