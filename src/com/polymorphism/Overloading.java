package com.polymorphism;

public class Overloading {
	
	private void Student(String name, String name1, String name2) {
		System.out.println(name+"\n"+ name1+"\n"+ name2);
		
	}
 private void Student(int age, int age1, int age2) {
	System.out.println(age+"\n"+age1+"\n"+age2);
	
}
 private void Student(char gender) {
		System.out.println(gender);
		
}
 public static void main(String[] args) {
	 Overloading a = new Overloading();
	a.Student("Vinoth", "Praveen", "Rajesh");
	a.Student(28, 27, 28);
	a.Student('M');
}
}
