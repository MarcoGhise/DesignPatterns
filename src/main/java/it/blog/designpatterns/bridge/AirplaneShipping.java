package it.blog.designpatterns.bridge;

public class AirplaneShipping implements Shipping {

	Product product;
	
	public AirplaneShipping(Product product) {
		this.product = product;
	}
	
	@Override
	public void ship() {
		/*
		 * Wrapping the box
		 */
		product.wrapping();		
		/*
		 * Check fragile
		 */
		if (product.isFragile())
		{
			/*
			 * Calc total Weight
			 */
			System.out.println("Total Weight: " + product.getWeight() + 100);
		}
		else
		{
			/*
			 * Calc total Weight
			 */
			System.out.println("Total Weight: " + product.getWeight() + 20);
		}
		/*
		 * Set shipping type
		 */
		product.ship("Airplane");
		
		System.out.println("Product Shipping " + product);		
	}

}
