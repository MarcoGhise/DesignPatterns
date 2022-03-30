package it.blog.designpatterns.facade;

public class Demo {

	public static void main(String[] args) {

		AssemblyLineFacade facade = new AssemblyLineFacade();
		
		Product product = facade.build("Apple");
		
		System.out.println(product);
	}
}