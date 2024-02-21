package it.blog.designpatterns.structural.decorator;

public interface AssemblyLine {
	
	void build(Product product);
	
	Product get();

}
