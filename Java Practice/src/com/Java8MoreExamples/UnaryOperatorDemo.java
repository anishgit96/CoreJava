package com.Java8MoreExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class A
{
	String s1;
    @Override
	public String toString() {
		return "[s1=" + s1 + ", s2=" + s2 + "]";
	}


	String s2;
	
    public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	
	A(String str1,String str2)
	{
      this.s1=str1;
      this.s2=str2;
	}
}

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		UnaryOperator<List> un=a->{
			
			a.add("Anish");
			a.add(new A("Udaipur","Deogarh"));
			a.add(new A("Udaipur","Deogarhh"));
			return a;	
		};
		
		UnaryOperator<List> un2=b->
		{
			b.add("Sol");
			return b;
		};
		
		ArrayList arr=new ArrayList();
		System.out.println(un.apply(arr));
		        	
}}