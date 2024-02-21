package it.blog.designpatterns.creational.builder;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	void setDimension(String dimension);
	void setWeight(double weight);
	void setPrice(double price);
	void setQty(int qty);
	void setUrlDownload(String url);
}
