package it.blog.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	 private List<Product> products = new ArrayList<>();
	 
	 public void addProduct(String name,	double price,	double qty, String type, String country)
	 {
		 Origin origin = OriginFactory.getOrigin(type, country);
		 Product product = new Product(name,	price,	qty, origin);
     products.add(product);
	 }

	public List<Product> getProducts() {
		return products;
	}
}
