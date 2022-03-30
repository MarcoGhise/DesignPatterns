package it.blog.designpatterns.bridge;

public interface Product {

	void wrapping();
	
	void ship(String type);
	
	double getWeight();
	
	boolean isFragile();
	
}