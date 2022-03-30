package it.blog.designpatterns.facade;

public class AssemblyLineFacade {

	public Product build(String productName) {
		
		Product product = new Product();	
		
		product.setName(productName);		
		/*
		 * Uppercase name
		 */
		product = NormalizeName.getUpperCaseName(product);
		/*
		 * Get Price
		 */
		product = PriceCalculator.getProductPrice(product);
		/*
		 * Get Season
		 */
		product = SeasonCalculator.getProductPrice(product);
		
		return product;
	}
}
