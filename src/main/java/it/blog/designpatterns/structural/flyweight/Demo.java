package it.blog.designpatterns.structural.flyweight;

public class Demo {

	public static void main(String[] args) {

		Basket basket = new Basket();		
		/*
		 * Product 1
		 */
		basket.addProduct("Apple", 10, 2, "Golden", "Italy");
		/*
		 * Product 2
		 */
		basket.addProduct("Pear",11, 4, "Golden", "Italy");
		/*
		 * Product 3
		 */
		basket.addProduct("Banana",5, 1, "Golden", "Italy");
		
		basket.getProducts().forEach(System.out::println);
	}

}
