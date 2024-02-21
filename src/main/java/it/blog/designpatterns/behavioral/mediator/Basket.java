package it.blog.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	List<Product> products = new ArrayList<Product>();
	
	public void add(Product product) {
		products.add(product);
	}
	
	public void remove(Product product) {
		products.remove(product);
	}

	public List<Product> getProducts() {
		return products;
	}

}