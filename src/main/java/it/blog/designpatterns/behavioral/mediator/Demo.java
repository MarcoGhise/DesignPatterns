package it.blog.designpatterns.behavioral.mediator;

public class Demo {

	public static void main(String[] args) {

		Mediator mediator = new BasketProductMediator(new Basket());
		
		/*
		 * Add Product
		 */
		Product apple = new Product("Apple", "Winter", 10);
		Product pear = new Product("Pear", "Autumn", 5);
		mediator.addProduct(apple);
		mediator.addProduct(pear);
		
		mediator.list().stream().forEach(System.out::println);
		mediator.removeProduct(pear);
		
		mediator.list().stream().forEach(System.out::println);
	}

}
