package com.learn.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	
	public static List<Integer> sort(List<Integer> list) {
		if(list.size()==1) return list;
		int temp = list.get(list.size()-1);
		list.remove(list.size()-1);
		list = sort(list);
		list = insert(list,temp);
		return list;
	}
	
	public static List<Integer> insert(List<Integer> list, int temp) {
		if(list.size()==0) {
			list.add(temp);
			return list;
		}else if(list.get(list.size()-1)<=temp) {
			list.add(list.size(),temp);
			return list;
		}else if(list.get(0)>=temp) {
			list.add(0,temp);
			return list;
		}else {
			int temp1 = list.get(list.size()-1);
			list.remove(list.get(list.size()-1));
			list = insert(list,temp);
			list.add(list.size(),temp1);
			return list;
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,5,4,2,7,3,6));
		list = sort(list);
		System.out.println(list);
	}

}
