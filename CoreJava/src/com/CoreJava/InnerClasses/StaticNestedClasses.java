package com.CoreJava.InnerClasses;

class outeclass{
	
	  int x = 10;

	  static class InnerClasss {
	    int y = 5;
	  }
	}

	public class StaticNestedClasses {
		
		
	  public static void main(String[] args) {
		  outeclass.InnerClasss myInner = new outeclass.InnerClasss();
	    System.out.println(myInner.y);
	    
	    StaticNestedClasses sc = new StaticNestedClasses();
	    sc.show();
	   }
	  
	  void show()
	  {
		  outeclass oc=new outeclass();
		     System.out.println(oc.x);
		     
	  }}


//Example 2
	/*
	 * class StaticNestedClasses { private static void outerMethod() {
	 * System.out.println("inside outerMethod"); }
	 * 
	 * // A static inner class static class Outer2 { public static void
	 * main(String[] args) { System.out.println("inside inner class Method");
	 * outerMethod(); } }
	 * 
	 * }
	 */

