package com.learning;

/* Q2: Create a ArrayList type of integers. Add 10 elements to list 
> find out all the odd numbers that exist in the list.
> Find out min element.
> Sort all values in desc order*/

import java.util.*;



public class Problem2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Collections.nCopies(10, 1));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<list.size();i++) {
			
			list.set(i, sc.nextInt());
		}
		sc.close();
		System.out.println("All odd elements : ");
		for(Integer i:list) {
			if(i%2!=0)
				System.out.println(i);
		}
		list.sort(Comparator.reverseOrder());
		System.out.println("The min element = " + list.get(9));
		System.out.println("Descending order = " + list);
		
		
	}
}
