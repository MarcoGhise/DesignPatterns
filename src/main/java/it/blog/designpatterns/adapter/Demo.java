package it.blog.designpatterns.adapter;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Insert Kilograms weight");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		UsMetric usMetric = new UsMetric();
		usMetric.setWeight(Double.parseDouble(input));
		
		UsMetricAdapter usMetricAdapter = new UsMetricAdapter(usMetric);
		
		System.out.println("Us Weight: " + usMetricAdapter.getWeight() + " Pounds");
		
		scanner.close();
	}
}
