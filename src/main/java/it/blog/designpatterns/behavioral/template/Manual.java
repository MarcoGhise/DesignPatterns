package it.blog.designpatterns.behavioral.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manual {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Feature feature = null;

		Product radio = new Product("Philips MX10", 0.9f);
		Product lawnMower = new Product("Bosh FY", 2.5f);

		System.out.println("\nWhat product have you bought?.\n" + "1 - Radio\n" + "2 - Bosh");
		int choice = Integer.parseInt(reader.readLine());
		
		switch(choice) {
		case 1:
			feature = new PowerFeature(radio);
			break;
		case 2:
			feature = new FuelEngineFeature(lawnMower);
			break;
		}
		
		/*
		 * Print instructions
		 */
		feature.turnOn();
		
		feature.turnOff();
		/*
		 * Calculate Shipping Price
		 */
		System.out.println(feature.calculateShippingCost());

	}

}
