package p009_collections_framework.A3_array_list_methods;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add(0, "iyoob");
		names.add(1, "sathish");//--> we can also use index, but we need to use it in the sequential order
		names.add(2, "ramesh");
		names.add(3, "goutham");
		
		System.out.println(names.contains("sathish"));
		System.out.println(names.clone());
//		----------------
		
		ArrayList<Student> Students = new ArrayList<Student>();
		Student s1 = new Student(101, "Sathish");
		Students.add(s1);
		Student s2 = new Student(101, "Sathish");
		System.out.println(Students.contains(s2));
//		-----------------
		System.out.println(names.size());// returns the total no of elements present
		names.remove(2);
		System.out.println(names.size());// returns the total no of elements present
//		-----------------
		System.out.println(names.isEmpty());//checks whether the list is empty or not 
//		----------------
		System.out.println(names);
		names.clear();//it will clear the list
		System.out.println(names.isEmpty());
		names.add( 0, "iyoob");
		names.add(1,  "sathish");
		names.add(2, "ramesh");
		names.add(3, "goutham");
		System.out.println(names.get(1));
		names.set(2,"ram");//update in the specific index
		System.out.println(names);//printd all the elements
		// add --> add will add the value and shifts everything to the right 
		// set --> set will only update the value in the specific index
		String oldvalue = names.set(1,"dea");
		System.out.println(names);
		System.out.println("oldvalue= "+ oldvalue);
		
//		indexof --> returns the index of the element present 
		System.out.println(names.indexOf("iyoob"));
		System.out.println(names.indexOf("dea"));
		System.out.println(names.indexOf("ram"));
		System.out.println(names.indexOf("goutham"));
		System.out.println(names.indexOf("ds"));//if not found throws -1
//		lastindexof --> it searches from right to left
		System.out.println(names.lastIndexOf("ram"));
// remove --> using index and value
			names.remove("dea");//removes using the object, it will not remove the whole matching element , it removes the first matching element
			names.remove(2);//removes using the index
			
//		========================	
			
			ArrayList<String> list = new ArrayList<>();

			list.add("A");
			list.add("B");
			list.add("A");
			list.add("C");
			list.add("A");
			
			while(list.remove("A"))
			{
				System.out.println(list);//it will print after removing the element 
			}
			
//			========================
			ArrayList<Integer> list1 = new ArrayList<>();

			list1.add(10);
			list1.add(20);
			list1.add(30);
			list1.remove(2);//it will remove based on the index
			System.out.println(list1);
			list1.remove(Integer.valueOf(10));//it will remove the value based on the value entered
			System.out.println(list1);			
//			remove() will remove the element based on the index
//			valueOf will search for the value and remove it
			
//			=========================================================
			ArrayList<String> arraynames = new ArrayList<String>();
			arraynames.add("sathish");
			arraynames.add("varun");
			arraynames.add("chintu");//we have passed the value using object
			
			Object arr[] = arraynames.toArray();//we are creating a copy of the arraylist to array
			for(Object obj:arr)//this ia an enhanced for loop (method 1)
			{
				System.out.println(obj);
			}	
//			=========================================================			
			names.forEach(arraynames2->System.out.println(arraynames));//using lambda expression(method 2)		
	}
}

//interview questions
//____________________________________________________________________
//|clear()					|list = null							 |
//|_________________________|________________________________________|
//|Removes all elements		|Removes the reference					 |
//|Object still exists		|Reference no longer points to the object|
//|Can still use list.add()	|list.add() throws NullPointerException	 |
//|_________________________|________________________________________|