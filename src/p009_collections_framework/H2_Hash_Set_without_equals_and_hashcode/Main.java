package p009_collections_framework.H2_Hash_Set_without_equals_and_hashcode;

import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		HashSet<Student> HashSetObj = new HashSet<Student>();
		
		Student s1 = new Student(101, "sathish");//creating the 1st object
		HashSetObj.add(s1);//adding the object to the set
		
		Student s2 = new Student(101, "sathish");//creating the 2nd object
		HashSetObj.add(s2);//adding the object to the set
		
		System.out.println(s1 == s2);// false because of the different objects
		System.out.println(s1.equals(s2));//false because of the different objects	
		System.out.println("total objects = "+ HashSetObj.size());// to print the size of the object 
		for(Student  s : HashSetObj)
		{
			s.display();
		}
	}
}

/*
 * Wait...

Both objects contain exactly the same data.

Why didn't HashSet remove one?

Memory View
Student s1 = new Student(101, "Sathish");
Student s2 = new Student(101, "Sathish");

Memory:

Heap

Student Object A
---------------
id = 101
name = Sathish

Student Object B
---------------
id = 101
name = Sathish

Although the values are the same,

the objects are different.

Their memory addresses are different.

Object A

↓

0x100
Object B

↓

0x200

Java sees

0x100

≠

0x200

Therefore

Not Equal
 */