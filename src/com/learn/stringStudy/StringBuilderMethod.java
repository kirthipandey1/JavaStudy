package com.learn.stringStudy;

public class StringBuilderMethod {
	
	public static String stringBuilderMethod() {
		String newLine = System.getProperty("line.separator");
		return new StringBuilder()
				.append("Get busy living")
				.append(newLine)
				.append("or")
				.append(newLine)
				.append("get busy dying")
				.toString();
	}

	public static void main(String[] args) {
		System.out.println(stringBuilderMethod());

	}

}
