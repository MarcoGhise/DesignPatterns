package it.blog.designpatterns.factorymethod;

public class VirtualPresentFactory extends Factory {

	@Override
	public Product createProduct() {
		return new VirtualProduct();
	}

}
