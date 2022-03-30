package it.blog.designpatterns.factorymethod;

public abstract class Factory {

	/**
   * Subclasses will override this method in order to create specific button
   * objects.
   */
	public abstract Product createProduct();
	
	public void run() {

    Product product = createProduct();
    product.run();
}
	
}
