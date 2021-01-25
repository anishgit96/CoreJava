package com.InnerClass;

class OuterClas {
	
	private class InnerClass
	{
		
		int show()
		{
			return 12;
		}
		
	}

}

class PrivateInnerClass
{
	public static void main(String[] args) {
		
		OuterClas oc = new OuterClas();
		//OuterClas.InnerClass ic =oc.new InnerClass();   //Error will come while call InnerClass, bcoz of private keyword before InnerClass
		//System.out.println(ic.show());
	      
	}
	
	
}


