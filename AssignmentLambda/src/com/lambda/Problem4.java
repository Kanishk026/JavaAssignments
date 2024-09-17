package com.lambda;

interface Factorial{
	public double fact(int n);
}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = (n)->{
			double ans = 1;
			for(int i=1;i<=n;i++) {
				ans *= i;
			}
			return ans;
		};
		double ans = f.fact(5);
		System.out.println(ans);
	}

}
