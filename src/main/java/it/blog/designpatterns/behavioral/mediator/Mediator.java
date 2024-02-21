package it.blog.designpatterns.behavioral.mediator;

import java.util.List;

public interface Mediator {

	void addProduct(Product product);
	void removeProduct(Product product);
	List<Product> list();
}
