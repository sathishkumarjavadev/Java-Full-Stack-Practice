package p009_collections_framework.A6_array_list_sorting_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student (101,"sa"));
		students.add(new Student (102,"th"));
		students.add(new Student(103, "ish"));
		System.out.println("before sorting");
		
		for(Student s : students)
		{
			s.display();
		}
		Collections.sort(students);
//		--------------------
		System.out.println("after sorting");
		for(Student s:students)
		{
			s.display();
		}
		
		
		
	}
}
//The Rule of compareTo()
//
//This is the most important thing to remember.
//
//Return Value	Meaning
//Negative	Current object comes before the other object
//Zero	Both are considered equal
//Positive	Current object comes after the other object
//
//Don't memorize the subtraction. Memorize what the return value means.