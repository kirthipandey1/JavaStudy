package com.learn.dsa.recursion05052024;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
	
	public static void spacePermutation(String input,String output,List<String> res) {
		if(input.length()==0) {
			res.add(output);
			return;
		}
		char ch = '_';
		char cha = input.charAt(0);
		spacePermutation(input.substring(1),output+ch+cha,res);
		spacePermutation(input.substring(1),output+cha,res);
	}

	public static void main(String[] args) {
		String input = "ABC";
		String output = "";
		output = input.substring(0,1);
		input = input.substring(1);
		List<String> res = new ArrayList<>();
		spacePermutation(input,output,res);
		System.out.println(res);
		
	}

}
