package it.blog.designpatterns.visitor;

public class WaterProduct extends Product{

	@Override
	double getAmount(Visitor visitor) {
		return visitor.liquidPrice(this);
	}

}
