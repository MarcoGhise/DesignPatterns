package it.blog.designpatterns.builder;

public class VoucherProduct {

	String dimension;
	double weight;
	double price;
	int qty;
	String url;

	public VoucherProduct(String dimension, double weight, double price, int qty, String url) {
		this.dimension = dimension;
		this.weight = weight;
		this.price = price;
		this.qty = qty;
		this.url = url;
	}

	@Override
	public String toString() {
		return "VoucherProduct [dimension=" + dimension + ", weight=" + weight + ", price=" + price + ", qty=" + qty
				+ ", url=" + url + "]";
	}

}
