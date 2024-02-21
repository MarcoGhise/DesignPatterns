package it.blog.designpatterns.behavioral.chainofresponsability;

import java.time.LocalDate;

public class SeasonHandler extends Handler {

	@Override
	public boolean check(Product product) {

		String season = null;

		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			season = "Winter";
		else if (today.compareTo(endOfSpring) < 0)
			season = "Spring";
		else if (today.compareTo(endOfSummer) < 0)
			season = "Summer";
		else if (today.compareTo(endOfAutumn) < 0)
			season = "Autumn";

		if (product.getSeason().equals(season))
			return super.checkNext(product);
		else
			System.out.println("Seasons don't match!!");
		
		return false;
	}

}
