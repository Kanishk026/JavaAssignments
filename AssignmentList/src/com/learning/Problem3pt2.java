package com.learning;
import java.util.*;

class Pair implements Comparable<Pair> {
    private int f;
    private String name;

    public Pair(int f, String name) {
        this.f = f;
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return "Pair [f=" + f + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Pair o) {
        // Compare based on the 'f' field
        return Integer.compare(o.f, this.f);
    }
}



public class Problem3pt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Pair> pairs = new ArrayList<>();
	        pairs.add(new Pair(1, "abc"));
	        pairs.add(new Pair(2, "c"));
	        pairs.add(new Pair(3, "s"));
	        Collections.sort(pairs);
	        for (Pair pair : pairs) {
	            System.out.println(pair);
	        }
	        int topK = 3;
	        int i = 0;
	        for (Pair pair : pairs) {
	            if (i == topK)
	            	break;
	        	System.out.println(pair.getName());
	            i++;
	        }
	}

}
 