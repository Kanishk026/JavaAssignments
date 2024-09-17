package com.lambda;

interface IPower{
	public double power(double x, double y);
}

public class Problem1 {
	public static void main(String[] args) {
		IPower pow = (x,y)->{
			return Math.pow(x, y);
		};
		double res = pow.power(6, 3);
		System.out.println(res);
	}
}
