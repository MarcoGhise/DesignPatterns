package it.blog.designpatterns.creational.factorymethod;

public class TangibleProduct implements Product {

	@Override
	public void run() {
		System.out.println("Unwrapped the box and push the button");
		
	}
}
