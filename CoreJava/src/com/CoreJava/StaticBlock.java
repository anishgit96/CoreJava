package com.CoreJava;

public class StaticBlock {
	
	static
	{
		int a=10;
		/*
		 * void show() {
		 *                                  //can not make the method inside static block.
		 * }
		 */
		System.out.println(a);
		StaticBlock.show();
		
	}
	
	static void show()
	{
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		
	}
}
