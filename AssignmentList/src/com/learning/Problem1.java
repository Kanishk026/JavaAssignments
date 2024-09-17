package com.learning;
// Q1: Create Student class with name and marks,
// write a method to find top 3 Students from the list of students based on marks.
import java.util.*;

class Student implements Comparable<Student>{
	private String name;
	private double marks;
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return Double.compare(that.marks, this.marks);
	}
	
}


public class Problem1 {

	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>();
		s.add(new Student("Kanishk1", 92));
		s.add(new Student("Kanishk2", 96));
		s.add(new Student("Kanishk3", 95));
		s.add(new Student("Kanishk4", 90));
		s.add(new Student("Kanishk5", 99));
		int j = 0;
		for(Student i:s) {
			if (j==3) {
				break;
				}
			System.out.println(i.getName());
			j++;
		}
	}

}
