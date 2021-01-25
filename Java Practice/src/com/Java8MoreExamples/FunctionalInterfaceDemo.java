package com.Java8MoreExamples;

interface intefaceimp
{
	void show(String a,String b);
}

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		intefaceimp ipm=(a,d)->
		{
			System.out.println(a+" "+d+" "+"Anish");
					
		};
		
		ipm.show("I","Am");	
		
	}
}