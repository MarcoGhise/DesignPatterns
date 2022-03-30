package it.blog.designpatterns.mediator;

public class Product {

	String name;
	String season;
	double price;
	String description;

	public Product() {
	}

	public Product(Product product) {
		this.name = product.getName();
		this.season = product.getSeason();
		this.price = product.getPrice();
	}

	public Product(String name, String season, double price) {
		this.name = name;
		this.season = season;
		this.price = price;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", season=" + season + ", price=" + price + ", description=" + description + "]";
	}
}