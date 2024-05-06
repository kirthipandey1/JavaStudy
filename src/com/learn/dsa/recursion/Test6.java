package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test6 {
	
	public static void reverse(Stack<Integer> st) {
		if(st.size()==1) return;
		int temp = st.pop();
		reverse(st);
		st.add(0,temp);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.addAll(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
		reverse(st);
		System.out.println(st);
	}

}
