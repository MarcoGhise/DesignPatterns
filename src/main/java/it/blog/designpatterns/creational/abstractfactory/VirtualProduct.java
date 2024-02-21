package it.blog.designpatterns.creational.abstractfactory;

public class VirtualProduct implements Product{

	@Override
	public void run() {
		System.out.println("Turn on Pc and run the application");
		
	}

	@Override
	public String getWrappingPaper() {
		return "A beautiful email";
	}

}
