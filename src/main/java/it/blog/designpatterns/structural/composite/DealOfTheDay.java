package it.blog.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DealOfTheDay implements Product {

	private List<Product> basketProducts = new ArrayList<>();

	@Override
	public double getPrice() {
		return basketProducts.stream().mapToDouble(p -> p.getPrice() * p.getQty()).sum();
	}

	public void addProduct(Product product) {
		basketProducts.add(product);
	}

	public void removeProduct(Product product) {
		basketProducts.remove(product);
	}

	@Override
	public double getQty() {
		return basketProducts.stream().mapToDouble(p -> p.getQty()).sum();
	}

}
