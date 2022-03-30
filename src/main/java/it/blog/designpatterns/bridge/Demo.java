package it.blog.designpatterns.bridge;

public class Demo {

	public static void main(String[] args) {

		TvProduct sonyLcd = new TvProduct();
		
		AirplaneShipping shipping = new AirplaneShipping(sonyLcd);
		
		shipping.ship();

	}

}
