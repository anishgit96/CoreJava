package com.Java8MoreExamples;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	public static void main(String[] args) {
		
		BinaryOperator<String> bin=(s,a)->{
			{
				
				return (s+" "+a);	
			}
		};
		System.out.println(bin.apply("Core","Java"));
	}}