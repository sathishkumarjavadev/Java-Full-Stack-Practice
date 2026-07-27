package p009_collections_framework.A7_array_list_sorting_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Student> obj = new ArrayList<Student>();
		
		obj.add(new Student(101,"sathish"));
		obj.add(new Student(22, "sas"));
		obj.add(new Student(34,"rda"));
		
		System.out.println("Before sorting");
		
		for(Student s : obj) {
			s.display();
		}
		
		Collections.sort(obj, new SortById());
		System.out.println("\n sorted by ID");
		for(Student s:obj)
		{
			s.display();
		}		
		
		Collections.sort(obj, new SortByName());
		System.out.println("\n sorted by Name");
		for(Student s:obj)
		{
			s.display();
		}
	}
}

/*
---------------------------------------------------------------------
Comparable					|		Comparator						|
---------------------------------------------------------------------
Inside the class			|	Outside the class					|
One default sorting rule	|	Many different sorting rules		|
Uses compareTo()			|	Uses compare()						|
Collections.sort(list)		|	Collections.sort(list, comparator)	|
---------------------------------------------------------------------
*/