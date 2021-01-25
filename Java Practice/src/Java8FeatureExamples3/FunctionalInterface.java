package Java8FeatureExamples3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;

interface Names<T>
{
	T show(ArrayList<String> countries);
}

public class FunctionalInterface {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		Names<ArrayList> countries=(list)->{
			
			list.add("India");
			list.add("America");
			list.add("Aus");
			
			return list;
						
	     };	
	     
	     
	     System.out.println(countries.show(al));	 
}}