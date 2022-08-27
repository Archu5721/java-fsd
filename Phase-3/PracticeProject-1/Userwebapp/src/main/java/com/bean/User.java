package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private int uid;
	private String uname;
	private String product;
	private float price;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", product=" + product + ", price=" + price + "]";
	}
}






