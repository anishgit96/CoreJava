package com.CoreJava.InnerClasses;

//Example1
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


//Example 2
/*class MyThread 
{ 
	public static void main(String[] args) 
	{ 
		                                                                        //Here we are using Anonymous Inner class 
		                                                                        //that implements a interface i.e. Here Runnable interface 
		Runnable r = new Runnable() 
		{ 
			public void run() 
			{ 
				System.out.println("Child Thread"); 
			} 
		}; 
		//MyThread my= new MyThread();
		
		
		Thread t = new Thread(r); 
		t.start(); 
		System.out.println("Main Thread"); 
	} 
}*/
