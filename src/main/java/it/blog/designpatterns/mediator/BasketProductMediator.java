package it.blog.designpatterns.mediator;

import java.util.List;

public class BasketProductMediator implements Mediator{

	Basket basket;
	
	public BasketProductMediator(Basket basket) {
		this.basket = basket;
	}
	
	@Override
	public void addProduct(Product product) {
		basket.add(product);		
	}

	@Override
	public void removeProduct(Product product) {
		basket.remove(product);
	}

	@Override
	public List<Product> list() {
		return basket.getProducts();
	}

}
