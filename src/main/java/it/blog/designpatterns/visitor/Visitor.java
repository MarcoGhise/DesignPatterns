package it.blog.designpatterns.visitor;

public interface Visitor {

	double liquidPrice(Product p);
	
	double solidPrice(Product p);
}
