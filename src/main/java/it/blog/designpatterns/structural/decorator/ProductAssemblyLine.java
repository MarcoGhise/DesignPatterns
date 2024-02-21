package it.blog.designpatterns.structural.decorator;

import java.time.LocalDateTime;

public class ProductAssemblyLine implements AssemblyLine{

	Product product;
	
	public ProductAssemblyLine(Product product) {
		this.product = product;
	}
	
	@Override
	public void build(Product product) {
		product.setTime(LocalDateTime.now());
		
	}

	@Override
	public Product get() {
		return product;
	}

}
