package com.learn.dsa.recursion05052024;

public class Test8 {
	
	public static void towerOfHanoi(int s,int d,int h,int rings) {
		if(rings==1) {
			System.out.println("Move "+s+" to "+d);
			return;
		}
		towerOfHanoi(s,h,d,rings-1);
		System.out.println("Move "+s+" to "+d);
		towerOfHanoi(h,d,s,rings-1);
	}

	public static void main(String[] args) {
		int s = 1, h=2,d=3;
		int rings = 3;
		towerOfHanoi(s,d,h,rings);
	}

}
