package com.learn.dsa.recursion;

public class Test7 {
	
	public static int kthGrammer(int n,int k) {
		if(n==1 && k==1) return 0;
		int mid = (int) (Math.pow(2,n-1)/2);
		if(k<=mid) {
			return kthGrammer(n-1,k);
		}else  {
			if(kthGrammer(n-1,k-mid)==1) return 0;
			else return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(kthGrammer(4,3));

	}

}
