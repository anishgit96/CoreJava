package com.Java8MoreExamples;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bipredicate=(s,d)-> (s+d)%2==0;
		
		System.out.println(bipredicate.test(20,20));
	}
}	