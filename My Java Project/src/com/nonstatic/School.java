//program for non-static members
package com.nonstatic;

public class School {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("student name "+s1.name+"\n marks"+s1.marks);
		s1.name="sba";
		s1.marks=75;
		System.out.println("student name "+s1.name+"\n marks"+s1.marks);
		Student s2=new Student();
		System.out.println("student name "+s2.name+"\n marks"+s2.marks);
		s2.name="syed";
		s2.marks=85;
		System.out.println("student name "+s2.name+"\n marks"+s2.marks);

	}

}
