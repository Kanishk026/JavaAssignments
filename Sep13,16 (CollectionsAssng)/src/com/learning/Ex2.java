package com.learning;

import java.util.*;

class Counter {
	public HashMap<String, Integer> counter(char arr[]) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			String key = String.valueOf(arr[i]);
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}
		return map;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		char[] charArray = { 'e','a','a','a','b','b', 'b', 'c', 'd', 'e' };
		Counter c = new Counter();
		HashMap<String, Integer> result = c.counter(charArray);

		System.out.println(result);
		
	}

}
