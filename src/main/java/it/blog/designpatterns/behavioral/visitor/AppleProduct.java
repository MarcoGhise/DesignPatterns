package it.blog.designpatterns.behavioral.visitor;

public class AppleProduct extends Product{

	@Override
	double getAmount(Visitor visitor) {
		return visitor.solidPrice(this);
	}

}
