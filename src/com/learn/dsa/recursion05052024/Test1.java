package com.learn.dsa.recursion05052024;

public class Test1 {

	public static void main(String[] args) {
		int n = 5;
		print1ton(n);
		System.out.println();
		printnto1(n);
	}
	
	public static void print1ton(int n) {
		if(n==0) return;
		print1ton(n-1);
		System.out.print(n+" ");
	}
	
	public static void printnto1(int n) {
		if(n==0) return ;
		System.out.print(n+" ");
		printnto1(n-1);
	}

}
