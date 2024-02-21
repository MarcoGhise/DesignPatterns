package it.blog.designpatterns.creational.abstractfactory;

public class TangiblePresentFactory implements PresentFactory {

	@Override
	public Product createProduct() {
		return new TangibleProduct();
	}
	
	

}
