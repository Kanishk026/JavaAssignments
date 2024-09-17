package com.learning;
import java.util.*;


public class Ex5 {
	public static int secondLargest(int arr[],int n) {
		Arrays.sort(arr);
		return arr[n-2];
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,98,21,33,121,990};
		int n = arr.length;
		if(n==0) {
			System.out.println("only one element");
		}
		else {
		int ans = Ex5.secondLargest(arr,n);
		System.out.println(ans);
		}
	}
}
