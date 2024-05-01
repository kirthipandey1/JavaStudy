package com.learn.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(new Student(111,"John",81,"Math"));
		listStudents.add(new Student(222,"Harsha",79,"History"));
		listStudents.add(new Student(333,"Ruth",87.2,"Computer"));
		listStudents.add(new Student(444,"Aroma",63.2,"Math"));
		listStudents.add(new Student(555,"Zdae",83.5,"Computer"));
		
		//Predicates
		Predicate<Student> mathPredicate = (Student st) -> st.getSpecialization().equals("Math");
		List<Student> res = new ArrayList<>();
		for(Student s:listStudents) {
			if(mathPredicate.test(s)) {
				res.add(s);
			}
		}
		
		System.out.println(res);
	}

}
