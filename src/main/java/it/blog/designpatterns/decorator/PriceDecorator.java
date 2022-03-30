package it.blog.designpatterns.decorator;

import java.time.LocalDate;

public class PriceDecorator extends AssemblyLineDecorator {

	PriceDecorator(AssemblyLine source) {
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
			product.setPrice(10);
		else if (today.compareTo(endOfSpring) < 0)
			product.setPrice(20);
		else if (today.compareTo(endOfSummer) < 0)
			product.setPrice(30);
		else if (today.compareTo(endOfAutumn) < 0)
			product.setPrice(40);

		super.build(product);

	}

	@Override
	public Product get() {
		return super.get();
	}

}
