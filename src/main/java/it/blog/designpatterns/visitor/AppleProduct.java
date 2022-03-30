package it.blog.designpatterns.visitor;

public class AppleProduct extends Product{

	@Override
	double getAmount(Visitor visitor) {
		return visitor.solidPrice(this);
	}

}
