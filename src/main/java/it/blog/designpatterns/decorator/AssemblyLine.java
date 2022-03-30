package it.blog.designpatterns.decorator;

public interface AssemblyLine {
	
	void build(Product product);
	
	Product get();

}
