package it.blog.designpatterns.observer;

public class Demo {

	public static void main(String[] args) {
		Basket basket = new Basket();
		
		basket.events.subscribe("add", new StoreHouseListener());

		Product apple = new Product("Apple", 10, 100);
		Product pear = new Product("Pear", 2, 20);
		Product grapes = new Product("Grapes", 8, 50);
		
		basket.add(apple);
		basket.add(pear);
		basket.add(grapes);
		
		basket.add(apple);
		
	}

}
