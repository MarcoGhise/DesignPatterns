package it.blog.designpatterns.structural.bridge;

public interface Product {

	void wrapping();
	
	void ship(String type);
	
	double getWeight();
	
	boolean isFragile();
	
}