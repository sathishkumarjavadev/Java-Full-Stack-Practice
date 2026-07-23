package p009_collections_framework.A1_array_list_without_getter_setter;

import java.util.ArrayList;

public class ArrayListWithoutGetterSetter {

	    public static void main(String[] args) {

	        // Creating ArrayList
	        ArrayList<Student> students = new ArrayList<>();

	        // Creating Student Objects
	        Student s1 = new Student(101, "Sathish");
	        Student s2 = new Student(102, "Rahul");
	        Student s3 = new Student(103, "Kumar");
	        Student s4 = new Student(104, "Arun");

	        System.out.println("==================================");
	        System.out.println("1. add(E element)");
	        System.out.println("==================================");

	        // add() returns boolean
	        System.out.println(students.add(s1));
	        students.add(s2);
	        students.add(s3);

	        System.out.println("\nStudents:");

	        for (Student s : students) {
	            s.display();
	        }

	        System.out.println("\n==================================");
	        System.out.println("2. Duplicate Elements");
	        System.out.println("==================================");

	        students.add(s2);

	        for (Student s : students) {
	            s.display();
	        }

	        System.out.println("\nArrayList allows duplicate objects.");

	        System.out.println("\n==================================");
	        System.out.println("3. add(index, element)");
	        System.out.println("==================================");

	        students.add(1, s4);

	        for (Student s : students) {
	            s.display();
	        }

	        System.out.println("\nNotice:");
	        System.out.println("Remaining elements shifted RIGHT.");

	        System.out.println("\n==================================");
	        System.out.println("4. remove(index)");
	        System.out.println("==================================");

	        Student removedStudent = students.remove(2);

	        System.out.println("Removed Student:");

	        removedStudent.display();

	        System.out.println("\nRemaining Students:");

	        for (Student s : students) {
	            s.display();
	        }

	        System.out.println("\nNotice:");
	        System.out.println("Remaining elements shifted LEFT.");

	        System.out.println("\n==================================");
	        System.out.println("5. remove(Object)");
	        System.out.println("==================================");

	        students.remove(s4);

	        for (Student s : students) {
	            s.display();
	        }

	        System.out.println("\nStudent object s4 removed.");

	        System.out.println("\n==================================");
	        System.out.println("6. Integer remove() Example");
	        System.out.println("==================================");

	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        System.out.println("Original List:");
	        System.out.println(numbers);

	        System.out.println("\nremove(1)");

	        numbers.remove(1);

	        System.out.println(numbers);

	        System.out.println("\nremove(Integer.valueOf(30))");

	        numbers.remove(Integer.valueOf(30));

	        System.out.println(numbers);

	        System.out.println("\n==================================");
	        System.out.println("Program Completed");
	        System.out.println("==================================");

	    }
}
/*
🎯 What You'll Learn from This One Program

After running it, you'll understand:

Concept	Covered
add(E)	✅
add(index, E)	✅
Duplicate objects	✅
remove(index)	✅
remove(Object)	✅
remove() method overloading	✅
int vs Integer	✅
Object references	✅
Left shift after remove	✅
Right shift after insert	✅

*/
 