package it.blog.designpatterns.structural.facade;

public class NormalizeName {

	public static Product getUpperCaseName(Product product)
	{
		Product productUppercaseName = new Product(product);
		
		productUppercaseName.setName(product.getName().toUpperCase());
		
		return productUppercaseName;
	}
}
