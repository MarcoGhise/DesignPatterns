package it.blog.designpatterns.decorator;

import java.time.LocalDate;

public class SeasonDecorator extends AssemblyLineDecorator {

	SeasonDecorator(AssemblyLine source) {
		super(source);
	}

	@Override
	public void build(Product product) {
		LocalDate today = LocalDate.now();

		LocalDate endOfWinter = LocalDate.of(today.getYear(), 3, 20);
		LocalDate endOfSpring = LocalDate.of(today.getYear(), 6, 21);
		LocalDate endOfSummer = LocalDate.of(today.getYear(), 9, 23);
		LocalDate endOfAutumn = LocalDate.of(today.getYear(), 12, 21);

		if (today.compareTo(endOfWinter) < 0)
			product.setSeason("Winter");
		else if (today.compareTo(endOfSpring) < 0)
			product.setSeason("Spring");
		else if (today.compareTo(endOfSummer) < 0)
			product.setSeason("Summer");
		else if (today.compareTo(endOfAutumn) < 0)
			product.setSeason("Autumn");

		super.build(product);

	}

	@Override
	public Product get() {
		return super.get();
	}

}
