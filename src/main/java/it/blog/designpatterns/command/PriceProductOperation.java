package it.blog.designpatterns.command;

import java.time.LocalDate;

public class PriceProductOperation implements ProductOperation {

	@Override
	public Product execute(Product product) {
		
		Product productPrice = new Product(product);
		
		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			productPrice.setPrice(10);
		else if (today.compareTo(endOfSpring) < 0)
			productPrice.setPrice(20);
		else if (today.compareTo(endOfSummer) < 0)
			productPrice.setPrice(30);
		else if (today.compareTo(endOfAutumn) < 0)
			productPrice.setPrice(40);
		
		return productPrice;
	}

}
