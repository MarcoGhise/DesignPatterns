package it.blog.designpatterns.command;

import java.time.LocalDate;

public class SeasonProductOperation implements ProductOperation {

	@Override
	public Product execute(Product product) {
		
		Product productSeason = new Product(product);
		
		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			productSeason.setSeason("Winter");
		else if (today.compareTo(endOfSpring) < 0)
			productSeason.setSeason("Spring");
		else if (today.compareTo(endOfSummer) < 0)
			productSeason.setSeason("Summer");
		else if (today.compareTo(endOfAutumn) < 0)
			productSeason.setSeason("Autumn");
		
		return productSeason;
	}
}