package com.InnerClass;

class OuterClass1 {
	
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}

	public class StaticInnerClass {
		
	  public static void main(String[] args) {
	    OuterClass1.InnerClass myInner = new OuterClass1.InnerClass();
	    System.out.println(myInner.y);
	    
	    StaticInnerClass sc = new StaticInnerClass();
	    sc.show();
	   }
	  
	  void show()
	  {
		     OuterClass1 oc=new OuterClass1();
		     System.out.println(oc.x);
		     
	  }	  
	}
