package com.learning;

import java.util.*;

public class Ex1 {
	
	public static List<Integer> toList(HashMap<String, Integer> map) {
	    List<Integer> list = new ArrayList<>(map.values());
	    Collections.sort(list);
	    return list;
	}

	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Kanishk", 120);
		map.put("Kanishk1", 100);
		map.put("Kanishk2", 800);
		List<Integer> arr = Ex1.toList(map);
		System.out.println(arr);

	}

}
