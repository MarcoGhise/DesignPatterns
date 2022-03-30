package it.blog.designpatterns.abstractfactory;

public class TangiblePresentFactory implements PresentFactory {

	@Override
	public Product createProduct() {
		return new TangibleProduct();
	}
	
	

}
