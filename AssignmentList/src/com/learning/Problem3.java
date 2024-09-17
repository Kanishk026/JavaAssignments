package com.learning;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        // Create a HashMap to store word frequencies
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

        // Convert the map to a List of Map Entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(map.entrySet());
        
        // Sort the List by values (in descending order)
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Create a LinkedHashMap to maintain the sorted order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println("Sorted by values (descending):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Read the number N
        System.out.println("Enter N to get top N frequent words: ");
        int N = sc.nextInt();

        // Print the top N frequent words
        System.out.println("Top " + N + " frequent words:");
        int i = 0;
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (i == N)
                break;
            System.out.println(entry.getKey() + ": " + entry.getValue());
            i++;
        }

        sc.close();
    }
}
