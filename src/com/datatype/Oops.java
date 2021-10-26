package com.datatype;

public class Oops
	{
		private void name()
		{
			System.out.println("James");	
		}	
		private void age() 
		{
			System.out.println("78");
		}
		private void place() 
		{
			System.out.println("Canada");
		}
		public static void main(String[] args) 
		{
			Oops x= new Oops();
			x.name();
			x.age();
			x.place();
		}
	}
