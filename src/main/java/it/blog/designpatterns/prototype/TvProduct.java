package it.blog.designpatterns.prototype;

import org.apache.commons.lang3.SerializationUtils;

public class TvProduct extends Product{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2107671140149932601L;

	public TvProduct(String dimension, double weight, double price, int qty) {
		super(dimension, weight, price, qty);
	}

	@Override
	public Product clone() {
		return (Product) SerializationUtils.clone(this);
	}

}
