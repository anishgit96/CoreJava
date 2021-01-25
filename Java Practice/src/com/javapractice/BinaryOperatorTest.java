package com.javapractice;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	
	public static void main(String[] args) {
		
	BinaryOperator<Integer>	ss=(a,b)->a+b;
	
	System.out.println(ss.apply(2, 2));
}}
