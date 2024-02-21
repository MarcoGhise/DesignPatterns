package it.blog.designpatterns.behavioral.iterator;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		ProductIterator products = new DailyBasketIterator(
				Arrays.asList(new Product("Apple", "Winter", 10), new Product("Peach", "Summer", 5), new Product("Grapes", "Winter", 15)));
		
		while(products.hasNext()) {
		  System.out.println(products.next().getDescription());
		}
	}
}