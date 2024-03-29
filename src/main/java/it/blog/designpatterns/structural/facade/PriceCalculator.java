package it.blog.designpatterns.structural.facade;

import java.time.LocalDate;

public class PriceCalculator {

	public static Product getProductPrice(Product product)
	{
		Product productPrice = new Product(product);
		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			product.setPrice(10);
		else if (today.compareTo(endOfSpring) < 0)
			product.setPrice(20);
		else if (today.compareTo(endOfSummer) < 0)
			product.setPrice(30);
		else if (today.compareTo(endOfAutumn) < 0)
			product.setPrice(40);
		
		return productPrice;
	}
}
