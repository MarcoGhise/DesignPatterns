package it.blog.designpatterns.structural.proxy;

public class Demo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Apple");
		product.setPrice(10);
		product.setSeason("Winter");
		
		IPrintProduct printProduct = new PrintProductProxy(new PrintProductReal());
		
		printProduct.print(product);

	}

}
