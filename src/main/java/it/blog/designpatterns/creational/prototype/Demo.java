package it.blog.designpatterns.creational.prototype;

public class Demo {

	public static void main(String[] args) {

		TvProduct sony = new TvProduct("20x30x40", 0.5, 300, 1);

		TvProduct sonyLcd = (TvProduct) sony.clone();
		
		sonyLcd.setPrice(400);
		
		System.out.println("Sony Tv:" + sony);
		
		System.out.println("SonyLcd Tv:" + sonyLcd);
	}

}
