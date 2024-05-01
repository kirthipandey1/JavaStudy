package com.learn.stringStudy;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringWriterClass {
	
	public static String stringWriterMethod() {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringWriter);
		printwriter.println("Get busy living");
		printwriter.println("or");
		printwriter.println("get busy dying");
		return stringWriter.toString();
	}

	public static void main(String[] args) {
		System.out.println(stringWriterMethod());

	}

}
