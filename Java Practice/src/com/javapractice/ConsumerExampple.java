package com.javapractice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExampple {
	
	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("string");
		c.accept("integer");
		
		}}