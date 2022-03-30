package it.blog.designpatterns.composite;

public class AppleProduct implements Product {

	private double qty;

	public AppleProduct(double qty) {
		this.qty = qty;
	}

	/*
	 * Leaf
	 */
	@Override
	public double getPrice() {
		return 10;
	}

	@Override
	public double getQty() {
		return qty;
	}

}
