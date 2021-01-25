package com.CoreJava.InnerClasses;


//Example1
/*class Outer1 { 
	void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	} 
} 
class MethodLocalInnerClass { 
	public static void main(String[] args) { 
		Outer1 x = new Outer1(); 
		x.outerMethod(); 
	} 
} 
*/

//Example2
/*class Outer1 { 
	   void outerMethod() { 
	      int x = 98; 
	      System.out.println("inside outerMethod"); 
	      class Inner { 
	         void innerMethod() { 
	            System.out.println("x= "+x); 
	         } 
	      } 
	      Inner y = new Inner(); 
	      y.innerMethod(); 
	   } 
	} 
	class MethodLocalInnerClass { 
	   public static void main(String[] args) { 
	      Outer1 x=new Outer1(); 
	      x.outerMethod(); 
	   } 
	}
	*/
	
//Example3
class Outer1 { 
	   void outerMethod() { 
	      int x = 98; 
	      System.out.println("inside outerMethod"); 
	      class Inner { 
	         void innerMethod() { 
	            System.out.println("x= "+x); 
	         } 
	      } 
	      Inner y = new Inner(); 
	      y.innerMethod(); 
	   } 
	} 
	class MethodLocalInnerClass { 
	   public static void main(String[] args) { 
	      Outer1 x=new Outer1(); 
	      x.outerMethod(); 
	   } 
	}


	
	
	
	
	
	
	
	
	
	