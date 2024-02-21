package it.blog.designpatterns.structural.decorator;

public class Demo {

	public static void main(String[] args) {

		Product apple = new Product();
		apple.setName("Apple");
		
		AssemblyLineDecorator assemblyLineDecorator = new PriceDecorator(
				new SeasonDecorator(new ProductAssemblyLine(apple)));
		
		assemblyLineDecorator.build(apple);

		System.out.println(assemblyLineDecorator.get());
	}

}
