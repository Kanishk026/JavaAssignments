package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


class Elgibility{
	public List<String> getList(HashMap<String, String> map){
		List<String> result = new ArrayList<>();
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String lastFour = value.substring(value.length() - 4);
            Integer dob = Integer.parseInt(lastFour);
            Integer cur_year = 2024;
            if ((cur_year - dob) >= 18) {
            	result.add(key);
            }
        }
		return result;
	}
}

public class Ex6 {
	public static void main(String[] args) {
		HashMap<String, String> votesMap = new HashMap<>();
//		Format dd/mm/yyyy
		votesMap.put("123","12-12-2024");
		votesMap.put("124","12-12-2021");
		votesMap.put("125","12-12-2001");
		votesMap.put("126","12-12-2000");

		Elgibility el = new Elgibility();
		List<String> res = el.getList(votesMap);
		System.out.println(res);
	}
}
