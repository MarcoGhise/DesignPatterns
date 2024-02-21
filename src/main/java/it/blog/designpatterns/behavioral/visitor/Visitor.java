package it.blog.designpatterns.behavioral.visitor;

public interface Visitor {

	double liquidPrice(Product p);
	
	double solidPrice(Product p);
}
