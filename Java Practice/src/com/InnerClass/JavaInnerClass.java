package com.InnerClass;


class OuterClass {
	
	int speed=100;
	
	 class InnerClass
	{
		
		int speed()
		{
			return speed;
		}
				
	}
}

class JavaInnerClass
{
	public static void main(String[] args) {
		
		OuterClass oc=new OuterClass();
		
	    OuterClass.InnerClass ex= oc.new InnerClass();
	    System.out.println(ex.speed());
		
	}
}