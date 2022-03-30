package it.blog.designpatterns.template;

public abstract class Feature {
	
	static final double priceForKilograms = 2;

	Product p;
	
	public Feature(Product p)
	{
		this.p = p;
	}
	
	abstract void turnOn();
	abstract void turnOff();
	abstract void powerSupply();
	
	public double calculateShippingCost() {
		return p.getWeight() * priceForKilograms;
	}
	
}
