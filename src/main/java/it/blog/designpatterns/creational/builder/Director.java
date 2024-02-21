package it.blog.designpatterns.creational.builder;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {
	
	public void constructorTvProduct(Builder builder)
	{
		builder.setDimension("10x20x30");
		builder.setPrice(100);
		builder.setQty(1);
		builder.setWeight(0.2);
	}
	
	public void constructorVoucherProduct(Builder builder)
	{
		builder.setPrice(50);
		builder.setQty(1);
		builder.setUrlDownload("https://my.gift.com/YTER87IIO");
	}
	
}