package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
	
	public static void letterCaseChange(String input,String output,List<String> res) {
		if(input.length()==0) {
			res.add(output);
			return;
		}
		if(Character.isAlphabetic(input.charAt(0))) {
			String ch1 = input.substring(0,1).toLowerCase();
			String ch2 = input.substring(0,1).toUpperCase();
			letterCaseChange(input.substring(1),output+ch1,res);
			letterCaseChange(input.substring(1),output+ch2,res);
		}else {
			String ch1 = input.substring(0,1);
			letterCaseChange(input.substring(1),output+ch1,res);
		}
	}

	public static void main(String[] args) {
		String input = "a1b1";
		String output = "";
		List<String> res = new ArrayList<>();
		letterCaseChange(input,output,res);
		System.out.println(res);
	}

}
