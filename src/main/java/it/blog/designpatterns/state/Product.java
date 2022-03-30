package it.blog.designpatterns.state;

public class Product {
	
	String name;

	public Product(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}

}
