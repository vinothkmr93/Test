package com.polymorphism;

public class Overriding2 extends Overriding1 {
	private void Product1() {
		System.out.println("Chicken Biriyani");
	}

	@Override
	public void Product(String name) {
		super.Product(name);
		this.Product1();
	}

	@Override
	public void Price(double price) {
		super.Price(price);
	}

	public static void main(String[] args) {
		Overriding2 b = new Overriding2();
		b.Product("Chicken 65");
		b.Price(300d);
		b.Product1();
	}
}