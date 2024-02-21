package it.blog.designpatterns.creational.abstractfactory;

public class TangibleProduct implements Product {

	@Override
	public void run() {
		System.out.println("Unwrapped the box and push the button");
		
	}
	@Override
	public String getWrappingPaper() {
		return "Multi color wrapping paper"; 
	}

	

}
