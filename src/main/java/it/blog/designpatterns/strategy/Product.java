package it.blog.designpatterns.strategy;

public class Product {
	
	String name;
	String shippingMethod;
	
	public Product(String name)
	{
		this.setName(name);
	}
	
	public Product(Product p) {
		this.setName(p.getName());
		this.setShippingMethod(p.getShippingMethod());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", shippingMethod=" + shippingMethod + "]";
	}

}