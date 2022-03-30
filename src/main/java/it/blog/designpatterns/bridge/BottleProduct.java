package it.blog.designpatterns.bridge;

public class BottleProduct implements Product{

	private String shippingType;
	
	@Override
	public void wrapping() {
		System.out.println("Use air protection");
	}

	@Override
	public double getWeight() {		
		return 0.7;
	}

	@Override
	public boolean isFragile() {		
		return true;
	}

	@Override
	public void ship(String type) {
		this.shippingType = type;
		
	}

	public String getShippingType() {
		return shippingType;
	}

}
