package com.lambda;

import java.util.HashMap;
import java.util.*;

interface Login{
	public boolean login(String uname, String pass);
}

public class Problem3 {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("admin","admin123" );
		m.put("user","user123");
		
		 Login l = (uname, pass) -> {
	            if (m.containsKey(uname) && m.get(uname).equals(pass)) {
	                return true;
	            } else {
	                return false;
	            }
	        };
        boolean res = l.login("admin","admin123");
        if (res == true)
        	System.out.println("Login succesful");
        else
        	System.out.println("Login failed");
	}
}
