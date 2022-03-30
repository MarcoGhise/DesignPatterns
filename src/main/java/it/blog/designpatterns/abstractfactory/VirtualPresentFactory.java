package it.blog.designpatterns.abstractfactory;

public class VirtualPresentFactory implements PresentFactory {

	@Override
	public Product createProduct() {
		return new VirtualProduct();
	}

}
