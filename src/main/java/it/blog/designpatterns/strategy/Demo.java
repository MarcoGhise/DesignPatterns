package it.blog.designpatterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static ShippingStrategy strategy;
  	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Please, select a shipping type:" + "\n" +
        "1 - Truck delivery" + "\n" +
        "2 - Air delivery" + "\n");
		int choice = Integer.parseInt(reader.readLine());
		
		if (choice == 1)
			strategy = new TruckShipping();
		else
			strategy = new AirShipping();
		
		Product sentProduct = strategy.shipProduct(new Product("Apple"));
		
		System.out.println("Product sent by ... " + sentProduct.getShippingMethod());
	}
}