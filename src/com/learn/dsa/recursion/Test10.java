package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test10 {
	
	public static void subset(String input,String output,List<String> res) {
		if(input.length()==0) {
			res.add(output);
			return;
		}
		char ch = input.charAt(0);
		subset(input.substring(1),output+ch,res);
		subset(input.substring(1),output,res);
	}

	public static void main(String[] args) {
		String input = "aab";
		String output = "";
		List<String> res = new ArrayList<>();
		subset(input,output,res);
		System.out.println(res);
		Set<String> unique = new HashSet<>();
		unique.addAll(res);
		System.out.println(unique);
	}

}
