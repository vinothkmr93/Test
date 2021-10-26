package com.inheritance;
public class Hier_Child2 extends Hier_Parent {
	private void actor1() 
	{
System.out.println("Actor1 is Vijay");
	}
	private void actor2() 
	{
System.out.println("Actor2 is Surya");
	}
	@Override
	public void Stars() 
	{ super.Stars();
	}
	public static void main(String[] args) {
		Hier_Child1 a = new Hier_Child1();
		Hier_Child2 b = new Hier_Child2();	
		a.Sports();
		a.player1();
		a.player2();
		b.Stars();
		b.actor1();
		b.actor2();
	}
}
	
