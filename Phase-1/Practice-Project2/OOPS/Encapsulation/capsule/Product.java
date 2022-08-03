package capsule;

public class Product {
	private int id;
	private String product;
	private int cost;
	
	
	public void setProductId(int id) {
		this.id=id;
	}
	public int getProductId() {
		return this.id;
	}
	public void setProductName(String name) {
		this.product=name;
	}
	public String getProductName() {
		return this.product;
	}
	public void setProductCost(int cost) {
		this.cost = cost;
	}
	public int getProductCost() {
		return this.cost;
	}
}
