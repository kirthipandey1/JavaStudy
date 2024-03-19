package com.learn.stringStudy;

public class TextBlocks {

	public static String textBlocksMethod() {
		return """
				reading new things
				exploring
				strings in java
				""";
	}
	
	public static void main(String[] args) {
		String multiline = """
				In java 15 we have 
				multiple lines
				using 3 quotes
				""";
		
		System.out.println(multiline);
		System.out.println(textBlocksMethod());
	}
	
}
