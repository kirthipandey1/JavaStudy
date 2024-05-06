package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
	
	public static void balanceParenthesis(int open,int close,String op,List<String> res) {
		if(open==0 && close==0) {
			res.add(op);
			return;
		}
		if(open!=0) {
			String op1 = "(";
			balanceParenthesis(open-1,close,op+op1,res);
		}
		if(close>open) {
			String op1 = ")";
			balanceParenthesis(open,close-1,op+op1,res);
		}
	}

	public static void main(String[] args) {
		List<String> res = new ArrayList<>();
		balanceParenthesis(3,3,"",res);
		System.out.println(res);
	}

}
