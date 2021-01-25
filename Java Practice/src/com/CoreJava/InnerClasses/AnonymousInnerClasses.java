package com.CoreJava.InnerClasses;

class Demo { 
void show() { 
	System.out.println("i am in show method of super class"); 
} 
void show1() { 
	System.out.println("i am in show method of super class"); 
} 
} 
class Flavor1Demo { 

// An anonymous class with Demo as base class 
static Demo d = new Demo() { 
	void show() { 
		super.show(); 
		System.out.println("i am in Flavor1Demo class"); 
	}
	void show1()
	{
		System.out.println("i am");	
	}
}; 
public static void main(String[] args){ 
	d.show();
	d.show1();
} 
}
