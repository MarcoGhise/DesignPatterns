package it.blog.designpatterns.factorymethod;

public class VirtualProduct implements Product{

	@Override
	public void run() {
		System.out.println("Turn on Pc and run the application");
		
	}
}