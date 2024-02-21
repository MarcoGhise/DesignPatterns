package it.blog.designpatterns.creational.factorymethod;

public class VirtualPresentFactory extends Factory {

	@Override
	public Product createProduct() {
		return new VirtualProduct();
	}

}
