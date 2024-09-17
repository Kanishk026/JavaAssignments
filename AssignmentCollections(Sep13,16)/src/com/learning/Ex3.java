package com.learning;

import java.util.*;

class Sq {
	public HashMap<Integer, Integer> getSquares(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], arr[i]*arr[i]);
		}
		return map;
	}
}

public class Ex3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,11,12};
		HashMap<Integer, Integer> m = new HashMap<>();
		Sq sq = new Sq();
		m = sq.getSquares(arr);
		System.out.println(m);
	}

}
