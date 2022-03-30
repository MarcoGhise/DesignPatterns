package it.blog.designpatterns.visitor;

public class Demo {

	public static void main(String[] args) {
		AppleProduct apple = new AppleProduct();
		apple.setName("Apple");
		apple.setPrice(0.55);
		apple.setQty(2);
		
		WaterProduct water = new WaterProduct();
		water.setName("Water");
		water.setPrice(0.22);
		water.setQty(1.5);
		
		Catalog catalog = new Catalog();
		
 		System.out.println("Total basket amount: " + catalog.catalogAmount(apple, water));

	}

}
