package it.blog.designpatterns.structural.bridge;

public class Demo {

	public static void main(String[] args) {

		TvProduct sonyLcd = new TvProduct();
		
		AirplaneShipping shipping = new AirplaneShipping(sonyLcd);
		
		shipping.ship();

	}

}
