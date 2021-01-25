package com.Java8MoreExamples;

import java.util.function.Predicate;

public class PredicateDemo {
	
	
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,12,14,54,76,57};
		
		Predicate<Integer> p1=x1->x1>10; 
		Predicate<Integer> p2=x1->x1%2==0;

		System.out.println("The nos greater than 10 are:");	
		m1(p1,x);
		
		System.out.println("The nos which are even:");	
        m1(p2,x);
        
        System.out.println("The nos which are greater than 10 and even");
	    m1(p1.and(p2),x);
	
	}
	
  public static void m1(Predicate<Integer> p, int[] x)
  {
	  for(int x1 : x)
	  {
		  if(p.test(x1))
		  {
			 System.out.println(x1); 
			  
		  }}  
       }
    }
