package it.blog.designpatterns.creational.abstractfactory;

public class VirtualPresentFactory implements PresentFactory {

	@Override
	public Product createProduct() {
		return new VirtualProduct();
	}

}
