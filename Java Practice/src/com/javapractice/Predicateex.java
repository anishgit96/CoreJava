package com.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


  public class Predicateex {
  
  public static void main(String[] args) {
  
  Predicate<Integer> p = i->i>100;
  
  System.out.println(p.test(10)); System.out.println(p.test(1000));
  
  } }
 

/*
 * class test { int a; int b;
 * 
 * public test(int a, int b) {
 * 
 * this.a=a; this.b=b;
 * 
 * }
 * 
 * }
 * 
 * public class Predicateex {
 * 
 * public static void main(String[] args) {
 * 
 * List<test> a=Arrays.asList(new test(10, 20),new test(23,45));
 * 
 * 
 * 
 * 
 * 
 * 
 * } // TODO Auto-generated constructor stub
 * 
 * 
 * }
 */
