package it.blog.designpatterns.creational.factorymethod;

public class TangiblePresentFactory extends Factory {

	@Override
	public Product createProduct() {
		return new TangibleProduct();
	}
	
	

}
