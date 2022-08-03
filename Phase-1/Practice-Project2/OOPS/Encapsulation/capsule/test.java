package capsule;

public class test {
	public static void main(String[] args) {
		System.out.println("Without Encapsulation");
		Student st = new Student();
		st.id = 30;
		st.name = "Kiruba";
		st.course = "Java";
		st.display();
		
		
		Product pro = new Product();
		pro.setProductId(1);
		pro.setProductName("Chocolate");
		pro.setProductCost(200);
		int id = pro.getProductId();
		String name = pro.getProductName();
		int cost = pro.getProductCost();
		System.out.println("Product Id :" +id);
		System.out.println("Product Name :" + name);
		System.out.println("Product Cost :" + cost);
	}
}
