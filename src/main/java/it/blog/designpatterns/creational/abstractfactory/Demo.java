package it.blog.designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class Demo { 
	/**
	 * Application picks the factory type and creates it in run time (usually at
	 * initialization stage), depending on the configuration or environment
	 * variables.
	 */
	private static Client configure(String input) {
		Client client;
		PresentFactory factory;

		

		if (input.equals("1")) {
			factory = new VirtualPresentFactory();
			client = new Client(factory);
		} else {
			factory = new TangiblePresentFactory();
			client = new Client(factory);
		}
		return client;
	}

	public static void main(String[] args) {
		
		System.out.print("Is a virtual (1) or physics (2) product ?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Client client = configure(input);
		System.out.println("You got a beatiful product wrapped up with " + client.getWrappingPaper());
		client.runProduct();
		scanner.close();
	}
}
