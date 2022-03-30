package it.blog.designpatterns.factorymethod;

public class TangiblePresentFactory extends Factory {

	@Override
	public Product createProduct() {
		return new TangibleProduct();
	}
	
	

}
