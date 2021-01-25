package com.Java8MoreExamples;

import java.util.function.Consumer;

class Movie
{
	
	String moviename;
	
	public Movie(String moviename) {
	  this.moviename=moviename;
	}
}

public class Consumerdemo {
	
	public static void main(String[] args) {
		
		Consumer<Movie> movie= m->System.out.println(m.moviename +" "+"Redy to Relese");
		Consumer<Movie> movie2=m->System.out.println(m.moviename +" "+"Flop");
		Consumer<Movie> movie3=m->System.out.println(m.moviename +"  "+"Hit");
		Consumer<Movie> cc=movie.andThen(movie2).andThen(movie3);
 
		Movie m=new Movie("Spider");
		cc.accept(m);		
		
	}}