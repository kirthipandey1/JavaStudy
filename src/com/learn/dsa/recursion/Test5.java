package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test5 {
	
	public static void deleteMid(Stack<Integer> st,int n) {
		if(st.size()==n) {
			st.pop();
			return;
		}
		int temp = st.pop();
		deleteMid(st,n);
		st.push(temp);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.addAll(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
		int n = (st.size()/2)+1;
		deleteMid(st,n);
		System.out.println(st);
	}

}
