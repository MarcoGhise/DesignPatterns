package it.blog.designpatterns.behavioral.observer;

public class Product {

	String name;
	double price;
	double qty;

	public Product() {
	}

	public Product(Product product) {
		this.name = product.getName();
		this.price = product.getPrice();
		this.qty = product.getQty();
	}

	public Product(String name, double price, double qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
}