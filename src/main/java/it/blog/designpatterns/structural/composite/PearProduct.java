package it.blog.designpatterns.structural.composite;

public class PearProduct implements Product {

	private double qty;

	public PearProduct(double qty) {
		this.qty = qty;
	}
	/*
	 * Leaf
	 */
	@Override
	public double getPrice() {		
		return 5;
	}
	
	@Override
	public double getQty() {
		return qty;
	}

}
