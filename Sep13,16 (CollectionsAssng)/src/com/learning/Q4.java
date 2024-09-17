package com.learning;

import java.util.*;

class Values{
	private String s1;
	private String s2;
	private int n1;
	private int n2;
	private int n3;

	public Values(String s1, String s2, int n1, int n2, int n3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;

	}

	@Override
	public String toString() {
		return "Values [s1=" + s1 + ", s2=" + s2 + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
	}
	
	
}

public class Q4 {

	public static void main(String[] args) {
		Set<Values> s = new HashSet<Values>(5);
		s.add(new Values("String 1", "String 2", 12, 13, 9));
		s.add(new Values("String 3", "String 4", 112, 113, 99));
		s.add(new Values("String 5", "String 6", 212, 213, 999));
		System.out.println(s);
	}

}
