package it.blog.designpatterns.creational.factorymethod;

import java.util.Scanner;

public class Demo {

	private static Factory factory;

	public static void main(String[] args) {

		System.out.print("Is a virtual (1) or physics (2) product ?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		configure(input);
		runBusinessLogic();

		scanner.close();
	}

	static void runBusinessLogic() {
		factory.run();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure(String input) {
		if (input.equals("2")) {
			factory = new TangiblePresentFactory();
		} else {
			factory = new VirtualPresentFactory();
		}
	}
}