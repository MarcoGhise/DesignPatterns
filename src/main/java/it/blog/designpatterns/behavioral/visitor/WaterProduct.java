package it.blog.designpatterns.behavioral.visitor;

public class WaterProduct extends Product{

	@Override
	double getAmount(Visitor visitor) {
		return visitor.liquidPrice(this);
	}

}
