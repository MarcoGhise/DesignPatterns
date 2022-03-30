package it.blog.designpatterns.builder;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class VoucherProductBuilder implements Builder{

	String dimension;
	double weight;
	double price;
	int qty;
	String url;
	
	@Override
	public void setDimension(String dimension) {
		this.dimension = dimension;		
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;		
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}

	@Override
	public void setQty(int qty) {
		this.qty = qty;
		
	}

	@Override
	public void setUrlDownload(String url) {
		this.url = url;		
	}
	
	public VoucherProduct getProduct() {
		return new VoucherProduct(dimension, weight, price, qty, url);
	}

}