package com.inheritance;

public class Single_Child extends Single_Parent
{
public void Child() 
{
System.out.println("Child");	
}

	@Override
	public void parent()
	{ 
		super.parent();
	}

public static void main(String[] args) {
	Single_Child a= new Single_Child();
	a.parent();
	a.Child();
}
}
