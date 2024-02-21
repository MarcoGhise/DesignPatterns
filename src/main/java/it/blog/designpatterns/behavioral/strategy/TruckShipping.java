package it.blog.designpatterns.behavioral.strategy;

public class TruckShipping implements ShippingStrategy{

	@Override
	public Product shipProduct(Product p) {
		Product shippingMethodProduct = new Product(p);
		shippingMethodProduct.setShippingMethod("Product sent by truck");
		return shippingMethodProduct;
	}

}
