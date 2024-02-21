package it.blog.designpatterns.structural.flyweight;

public class Origin {

	String type;
	String contry;
	
	public Origin(String type, String country)
	{
		this.type = type;
		this.contry = country;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
}
