package com.lambda;

interface Space{
	public String space(String s);
}


public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Space sp = (String s)->{
			String str ="";
			for(int i=0;i<s.length();i++) {
				if (i == s.length()- 1)
					str += s.charAt(i);
				else
					str += s.charAt(i) + " ";
			}
			return str;
		};
		String s = "CG";
		String ans = sp.space(s);
		System.out.println(ans);
	}

}
