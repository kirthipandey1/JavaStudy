package com.learn.stringStudy;

public class LineSeperator {

	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		String toSeperate = "Hello"
				.concat(newLine)
				.concat("adding content")
				.concat(newLine)
				.concat("Lets be busy");
		
		System.out.println(toSeperate);
		
		System.out.println("------------------");
		
		String seperate = "Hello"
				+ newLine
				+ "adding content"
				+ newLine
				+ "Lets be busy";
		
		System.out.println(seperate);

	}

}
