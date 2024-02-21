package it.blog.designpatterns.structural.proxy;

public class PrintProductProxy implements IPrintProduct{

	IPrintProduct printProduct;
	
	public PrintProductProxy(IPrintProduct printProduct) {
		this.printProduct = printProduct; 
	}
	@Override
	public void print(Product product) {
		System.out.println("Go through proxy....");
		printProduct.print(product);		
		System.out.println("...End proxy!");
	}

}
