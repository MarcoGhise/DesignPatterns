package it.blog.designpatterns.prototype;

import java.io.Serializable;

public abstract class Product implements Serializable{

	String dimension;
	double weight;
	double price;
	int qty;

	public Product(String dimension, double weight, double price, int qty) {
		this.dimension = dimension;
		this.weight = weight;
		this.price = price;
		this.qty = qty;
	}

	public abstract Product clone();
	
	public String toString() {
		return "TvProduct [dimension=" + dimension + ", weight=" + weight + ", price=" + price + ", qty=" + qty + "]";
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
