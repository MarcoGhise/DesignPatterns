package it.blog.designpatterns.behavioral.template;

public class PowerFeature extends Feature {

	public PowerFeature(Product p) {
		super(p);
	}

	@Override
	void turnOn() {
		System.out.println("Push button Start on \"" + p.getName() + "\" dashboard");

	}

	@Override
	void turnOff() {
		System.out.println("Push again button Start on \"" + p.getName() + "\" dashboard");

	}

	@Override
	void powerSupply() {
		System.out.println("Plug \"" + p.getName() + "\" into power network");

	}

}
