package com.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Using iterator

public class Q1 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("A");s.add("B");s.add("C");s.add("D");
		
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
