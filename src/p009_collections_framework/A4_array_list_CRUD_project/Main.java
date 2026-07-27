package p009_collections_framework.A4_array_list_CRUD_project;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(new Student(1, "sathish"));
		obj.add(new Student(3, "kumar"));
		obj.add(new Student(3, "sasar"));
		
//		enhanced for loop
		for(Student s:obj) {
			s.display();
		}
		
	}
}
//Notice something.
//
//Earlier we used:
//ArrayList<String>
//
//Now we are using
//ArrayList<Student>
//
//This is how Collections are actually used in companies.
//Instead of storing Strings,
//they store
//1. Employee
//2. Student
//3. Product
//4. Customer
//5. Order
//
//objects.