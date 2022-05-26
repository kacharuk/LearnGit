package main;

public class InHouseProduct extends Product {
	
	@Override
	public double getDiscount() {
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		this.applyExtraDiscount();
		return discount;
	}
	
	public void applyExtraDiscount() {
		discount = discount * 1.5;
	}
}
