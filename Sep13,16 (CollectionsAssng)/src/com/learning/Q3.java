package com.learning;
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Set<Float> s = new HashSet<>();
		s.add(34.32f);s.add(3.10f);s.add(3423.11f);
		System.out.println(s);
		Iterator<Float> i = s.iterator();
		double ans = 0;
		while(i.hasNext()) {
			ans += i.next();
		}
		System.out.println(ans);
	}
}
