package com.arjun.java8.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudentList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Mahesh", 12));
		list.add(new Student(2, "Suresh", 15));
		list.add(new Student(3, "Nilesh", 10));

		System.out.println("---Natural Sorting by Name---");

		list.stream().sorted().forEach(e -> System.out.println(e.toString()));

		System.out.println("---Natural Sorting by Name in reverse order---");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e.toString()));

		System.out.println("---Sorting using Comparator by Age---");
		list.stream().sorted(Comparator.comparing(Student::getAge)).forEach(e -> System.out.println(e.toString()));

		System.out.println("---Sorting using Comparator by Age with reverse order---");
		list.stream().sorted(Comparator.comparing(Student::getAge).reversed())
				.forEach(e -> System.out.println(e.toString()));

	}

}
