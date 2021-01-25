package com.javapractice;

import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		
		Supplier<String> s=()->
		{
	          String[] s1= {"ani","anish","ayu","ayush"};
	          int x=(int)(Math.random()*3+1);
	          return s1[x];
			
		};
		System.out.println(s.get());
		
}
}