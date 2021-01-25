package com.CoreJava;

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

class MyThread implements Runnable
{
	
	public static void main(String[] args) 
	{ 
		
		MyThread myThread=new MyThread();
		
		Thread thread=new Thread(myThread);
		
		thread.start();
	
	}

	@Override
	public void run() {
		
		System.out.println("Test The Thread");
	}
	
	
}
