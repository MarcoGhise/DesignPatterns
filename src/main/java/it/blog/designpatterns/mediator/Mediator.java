package it.blog.designpatterns.mediator;

import java.util.List;

public interface Mediator {

	void addProduct(Product product);
	void removeProduct(Product product);
	List<Product> list();
}
