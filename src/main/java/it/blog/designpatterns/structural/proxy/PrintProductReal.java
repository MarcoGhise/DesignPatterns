package it.blog.designpatterns.structural.proxy;

public class PrintProductReal implements IPrintProduct{

	@Override
	public void print(Product product) {
		System.out.println(product);	
	}

}
