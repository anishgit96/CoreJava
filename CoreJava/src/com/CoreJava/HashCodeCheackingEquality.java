package com.CoreJava;

public class HashCodeCheackingEquality {
	
	
	/*
	 * Boolean checkequality(String str1,String str2) { if(str1.equals(str2)) {
	 * return true; } return false; }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * String str1=new String("Anish"); String str2=new String("Anish");    //true
	 * 
	 * 
	 * CheackingEquality ce = new CheackingEquality();
	 * System.out.println(ce.checkequality(str1, str2));
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Anish");
		Student s2 = new Student(2,"Anish");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.id==s2.id);
		System.out.println(s1.name==s2.name);
		
	}
}

class Student
{
	
int id;
String name;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}