package com.learning;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("A");s.add("B");s.add("CDE");s.add("   F ");s.add("G");
		System.out.println(s);
		
		String str1 ="";
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			str1 += i.next();
			
		}
		System.out.println(str1);
	}
}
