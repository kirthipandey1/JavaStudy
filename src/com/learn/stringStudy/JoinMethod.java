package com.learn.stringStudy;

public class JoinMethod {
	
	public static String stringJoin() {
		String newLine = System.getProperty("line.separator");
		return String.join(newLine, "Get busy living",
				"or","get busy dying!!");
	}

	public static void main(String[] args) {
		System.out.println(stringJoin());

	}

}
