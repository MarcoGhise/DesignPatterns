package it.blog.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class DailyBasketIterator implements ProductIterator {

	private int currentPosition = 0;

	private List<Product> products = new ArrayList<>();

	public DailyBasketIterator(List<Product> input)
	{
		products = input;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < products.size();
	}

	@Override
	public Product next() {
		if (!hasNext()) {
			return null;
		}
		
		Product product = products.get(currentPosition);
		
		product.setDescription(product.getSeason() + "'s " + product.getName() + " are in basket with price: " + product.getPrice());
		
		currentPosition++;
		
		return product;
	}

}
