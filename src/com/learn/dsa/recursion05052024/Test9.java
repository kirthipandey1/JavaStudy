package com.learn.dsa.recursion05052024;

public class Test9 {
	
	public static void subset(String input,String output) {
		if(input.length()==0) {
			System.out.print(output+" ");
			return;
		}
		char ch = input.charAt(0);
		subset(input.substring(1),output+ch);
		subset(input.substring(1),output);
	}

	public static void main(String[] args) {
		String input = "ab";
		String output = "";
		subset(input,output);

	}

}
