package it.blog.designpatterns.proxy;

public class Product {

	String name;
	String season;
	double price;
	
	public Product() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", season=" + season + ", price=" + price + "]";
	}
}