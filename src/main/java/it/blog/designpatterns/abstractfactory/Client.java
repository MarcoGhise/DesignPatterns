package it.blog.designpatterns.abstractfactory;

public class Client {
	private Product product;

	public Client(PresentFactory factory) {
		product = factory.createProduct();
	}

	public void runProduct() {
		product.run();
	}
	
	public String getWrappingPaper() {
		return product.getWrappingPaper();
	}
}
