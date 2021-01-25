package com.Java8MoreExamples;

import java.util.function.Supplier;

public class Supplierdemo {

	public static void main(String[] args) {
		
		Supplier<String> s=()->{
			
			String otp="";
			
			for(int i=0; i<6; i++)
			{
				otp=otp+(int)(Math.random()*1000);
				
			}
			return otp;
		};
		System.out.println(s.get());
	}
}