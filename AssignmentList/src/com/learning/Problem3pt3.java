package com.learning;

import java.util.*;

public class Problem3pt3 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 15 strings: ");
        for (int i = 0; i < 15; i++) {
            String new_el = sc.nextLine();
            
            if (map.containsKey(new_el)) {
                map.put(new_el, map.get(new_el) + 1);
            } else {
                map.put(new_el, 1);
            }
        }
        System.out.println("Enter k");
        int n = sc.nextInt();
        sc.close();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()) // Max heap
            );
        
        pq.addAll(map.entrySet());
        System.out.println(pq);
        while (n!=0) {
        	System.out.println(pq.poll().getKey());
        	n--;
        }
        
	}

}
