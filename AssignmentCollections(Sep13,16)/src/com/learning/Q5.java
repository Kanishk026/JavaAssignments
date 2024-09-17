package com.learning;

import java.util.*;

class ValuesForP5{
	private String name;
	private String age;
	private int n1,n2,n3;
	public ValuesForP5(String name, String age, int n1, int n2, int n3) {
		super();
		this.name = name;
		this.age = age;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	@Override
	public String toString() {
		return "ValuesForP5 [name=" + name + ", age=" + age + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
	}
	
}

public class Q5 {

	public static void main(String[] args) {
		Set<ValuesForP5> s = new HashSet<ValuesForP5>();
		s.add(new ValuesForP5("Kanishk", "22", 12, 13, 9));
		s.add(new ValuesForP5("Kani", "44", 112, 113, 99));
		for(ValuesForP5 i: s) {
			System.out.println(i);
		}
		System.out.println(" ");

		Iterator<ValuesForP5> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
	}
	
} }
