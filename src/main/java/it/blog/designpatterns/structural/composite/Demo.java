package it.blog.designpatterns.structural.composite;

public class Demo {

	public static void main(String args[])
	{
		AppleProduct apple = new AppleProduct(2);
		PearProduct pear = new PearProduct(0.8);
		
		DealOfTheDay dotd = new DealOfTheDay();
		dotd.addProduct(apple);
		dotd.addProduct(pear);
		
		System.out.println("Total Weight: " + dotd.getQty());
		System.out.println("Total Price: " + dotd.getPrice());
		
	}
}
