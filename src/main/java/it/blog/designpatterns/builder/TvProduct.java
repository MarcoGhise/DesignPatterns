package it.blog.designpatterns.builder;

public class TvProduct {

	String dimension;
	double weight;
	double price;
	int qty;
	String url;

	public TvProduct(String dimension, double weight, double price, int qty, String url) {
		this.dimension = dimension;
		this.weight = weight;
		this.price = price;
		this.qty = qty;
		this.url = url;
	}

	@Override
	public String toString() {
		return "TvProduct [dimension=" + dimension + ", weight=" + weight + ", price=" + price + ", qty=" + qty
				+ ", url=" + url + "]";
	}

}
