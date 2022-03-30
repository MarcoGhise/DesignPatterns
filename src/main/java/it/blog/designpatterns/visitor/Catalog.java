package it.blog.designpatterns.visitor;

public class Catalog implements Visitor{

	@Override
	public double liquidPrice(Product p) {
		System.out.println("Liquid Price:" + p.price * p.getQty() * 1.2);
		return p.price * p.getQty() * 1.2;
	}

	@Override
	public double solidPrice(Product p) {
		System.out.println("Solid Price:" + p.price * p.getQty());
		return p.price * p.getQty();
	}
	
	public double catalogAmount(Product...products)
	{
		double amount = 0;
		
		for (Product p : products)
			amount += p.getAmount(this);
		
		return amount;
	}

}
