package com.javapractice;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	
	public static void main(String[] args) {
		
		UnaryOperator unaryoperator= s->"Hello"+s;
			System.out.println(unaryoperator.apply("World"));	
		
	}	

}
