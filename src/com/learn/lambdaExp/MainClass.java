package com.learn.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(new Student(111,"John",81,"Math"));
		listStudents.add(new Student(222,"Harsha",79,"History"));
		listStudents.add(new Student(333,"Ruth",87.2,"Computer"));
		listStudents.add(new Student(444,"Aroma",63.2,"Math"));
		listStudents.add(new Student(555,"Zdae",83.5,"Computer"));
		
		System.out.println("Predicates");
		
		//Predicates
		Predicate<Student> mathPredicate = (Student st) -> st.getSpecialization().equals("Math");
		List<Student> res = new ArrayList<>();
		for(Student s:listStudents) {
			if(mathPredicate.test(s)) {
				res.add(s);
			}
		}
		
		System.out.println(res);
		
		System.out.println();
		System.out.println("Conusmers");
		//Consumers
		Consumer<Student> percentConsumer = (Student st) ->
				{ System.out.println(st.getName()+" : "+st.getPercentage()); };	
		for(Student s:listStudents) {
			percentConsumer.accept(s);
		}
		
		System.out.println();
		System.out.println("Function");
		
		//Function
		Function<Student,String> nameFunction = (Student st) -> st.getName();
		List<String> studentNames = new ArrayList<>();
		for(Student st: listStudents) {
			studentNames.add(nameFunction.apply(st));
		}
		
		System.out.println(studentNames);
		
		System.out.println();
		System.out.println("Supplier");
		
		//Supplier
		Supplier<Student> studentSupplier = () -> new Student(1111, "new Student", 92.2, "Java 8");
		listStudents.add(studentSupplier.get());
		
		for(Student s : listStudents) 
		System.out.println(s);
		
		
	}

}
