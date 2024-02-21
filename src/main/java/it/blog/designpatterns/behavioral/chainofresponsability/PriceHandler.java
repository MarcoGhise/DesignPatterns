package it.blog.designpatterns.behavioral.chainofresponsability;

import java.time.LocalDate;

public class PriceHandler extends Handler {

	@Override
	public boolean check(Product product) {

		double price = 0;

		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			price = 10;
		else if (today.compareTo(endOfSpring) < 0)
			price = 20;
		else if (today.compareTo(endOfSummer) < 0)
			price = 30;
		else if (today.compareTo(endOfAutumn) < 0)
			price = 40;

		if (product.getPrice() == price)
			return super.checkNext(product);
		else
			System.out.println("Price doesn't match!!");

		return false;
	}

}
