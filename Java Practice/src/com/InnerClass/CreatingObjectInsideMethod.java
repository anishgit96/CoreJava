package com.InnerClass;

public class CreatingObjectInsideMethod {
	
	int x=10;
	
	public static void main(String[] args) {
		
		CreatingObjectInsideMethod cim=new CreatingObjectInsideMethod();
		cim.show();
		
	}
	
	private void show()
	{
		CreatingObjectInsideMethod cim=new CreatingObjectInsideMethod();
		System.out.println(cim.x);
	}

}
