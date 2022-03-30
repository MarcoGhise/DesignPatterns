package it.blog.designpatterns.template;

public class FuelEngineFeature extends Feature {

	public FuelEngineFeature(Product p) {
		super(p);
	}

	@Override
	void turnOn() {
		System.out.println("Insert the key and into \"" + p.getName() + "\" and turn it");
		
	}

	@Override
	void turnOff() {
		System.out.println("Turn the key in reverse way and remove it from \"" + p.getName() + "\"");
		
	}

	@Override
	void powerSupply() {
		System.out.println("Fill the \"" + p.getName() + "\" tank with the correct fuel");
		
	}

}
