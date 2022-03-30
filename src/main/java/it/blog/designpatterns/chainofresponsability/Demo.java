package it.blog.designpatterns.chainofresponsability;

public class Demo {

	public static void main(String[] args) {
		Handler handler = new SeasonHandler();
		
		handler.linkWith(new PriceHandler());
		
		Product product = new Product();
		product.setName("Apple");
		product.setSeason("Winter");
		product.setPrice(10);
		
		if (handler.check(product))
			System.out.println("Product Verified");
		else
			System.out.println("Invalid Product!!");
	}
}