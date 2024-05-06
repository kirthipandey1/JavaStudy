package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
	
	public static void caseChange(String input,String output,List<String> res) {
		if(input.length()==0) {
			res.add(output);
			return;
		}
		String ch1 = input.substring(0,1).toLowerCase();
		String ch2 = input.substring(0,1).toUpperCase();
		caseChange(input.substring(1),output+ch1,res);
		caseChange(input.substring(1),output+ch2,res);
		
	}

	public static void main(String[] args) {
		String input = "ab";
		String output = "";
		List<String> res = new ArrayList<>();
		caseChange(input,output,res);
		System.out.println(res);
	}

}
