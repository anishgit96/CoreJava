package com.CoreJava.InnerClasses;

class Outer { 
	// Simple nested inner class 
	class Inner { 
		public void show() { 
			System.out.println("In a nested class method"); 
		} 
	} 
	} 
	class NoramlOrRegularInnerClass { 
	public static void main(String[] args) { 
		Outer.Inner in = new Outer().new Inner(); 
		in.show(); 
	} 
	} 
