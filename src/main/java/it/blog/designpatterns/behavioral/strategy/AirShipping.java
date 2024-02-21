package it.blog.designpatterns.behavioral.strategy;

public class AirShipping implements ShippingStrategy{

	@Override
	public Product shipProduct(Product p) {
		Product shippingMethodProduct = new Product(p);
		shippingMethodProduct.setShippingMethod("Product sent by Airplane");
		return shippingMethodProduct;
	}

}
