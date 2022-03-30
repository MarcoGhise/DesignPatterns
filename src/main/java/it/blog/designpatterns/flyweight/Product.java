package it.blog.designpatterns.flyweight;

public class Product {

	String name;
	double price;
	double qty;
	Origin origin;
	
	public Product(String name,	double price,	double qty,	Origin origin)
	{
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.origin = origin;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public Origin getOrigin() {
		return origin;
	}
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qty=" + qty + ", origin=" + origin + "]";
	}
}
