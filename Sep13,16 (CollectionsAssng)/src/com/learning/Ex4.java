package com.learning;
import java.util.*;

class MedalInfo{
	public HashMap<String,String> getStudents(HashMap<String, Integer> map){
//		List<String> list = new ArrayList<>();
		HashMap<String,String> result = new HashMap<>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= 90)
            	result.put(key,"GOLD");
            else if(value>=80 && value<90)
            	result.put(key, "SILVER");
            else if(value>=70 && value<80)
            	result.put(key, "BRONZE");
            else
            	result.put(key, "NO MEDAL");
        }
		return result;
	}
}

public class Ex4 {
	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<>();
		students.put("123",96);
		students.put("124",66);
		students.put("125",86);
		students.put("126",76);

		MedalInfo mi = new MedalInfo();
		HashMap<String, String> res = mi.getStudents(students);
		System.out.println(res);
	}
	
}

