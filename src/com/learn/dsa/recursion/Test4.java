package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test4 {
	
	public static void sort(Stack<Integer> st) {
		if(st.size()==1) return;
		int temp = st.pop();
		sort(st);
		insert(st,temp);
	}
	
	public static void insert(Stack<Integer> st,int temp) {
		if(st.isEmpty()) st.push(temp);
		else if(st.get(st.size()-1)<=temp) st.push(temp);
		else {
			int temp1 = st.pop();
			insert(st,temp);
			st.push(temp1);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.addAll(new ArrayList<>(Arrays.asList(4,3,5,1,2,7,6)));
		sort(st);
		System.out.println(st);
	}

}
