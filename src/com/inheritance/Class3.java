package com.inheritance;

public class Class3 extends Class2 {
//Multilevel Inheritance
	private void grandChild()
	{
		System.out.println("Sports");
	
	}
	
	@Override
	public void parent() {
		super.parent();
	}
	
	@Override
	public void Child() {
		super.Child();
	}
	public static void main(String[] args) {
		Class3 a= new Class3();
		a.parent();
		a.Child();
		a.grandChild();
		
	}
}
