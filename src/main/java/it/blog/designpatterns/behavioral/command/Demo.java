package it.blog.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Product apple = new Product();
		apple.setName("Apple");
		/*
		 * Set Price
		 */
		List<ProductOperation> operations = new ArrayList<>();
		
		operations.add(new PriceProductOperation());
		operations.add(new SeasonProductOperation());
		
		operations.stream().forEach(o -> {
			Product p = o.execute(apple);
			System.out.println(p);
		});
		
		
		
	}

}
