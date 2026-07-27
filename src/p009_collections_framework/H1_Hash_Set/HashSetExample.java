package p009_collections_framework.H1_Hash_Set;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);set.add(30);set.add(15);set.add(54);
		set.add(20);set.add(30);set.add(25);set.add(54);
		set.add(35);set.add(10);set.add(40);set.add(20);
		System.out.println("total size = "+set.size());//returns size of the set
		
		for(int i:set)
		{
			System.out.println(i);
		}
		System.out.println("========================");
		System.out.println(set);
		set.add(35);//add
		set.add(null);//null value
		System.out.println(set);
		System.out.println(set.add(22));//returns true
		System.out.println(set.add(22));//returns false because element already exists
		System.out.println("total size = "+set.size());//returns size of the set
		set.remove(10);//removing the element
		System.out.println("total size = "+set.size());//returns size of the set
		System.out.println(set.contains(25));//to search
		System.out.println(set.isEmpty());//to check empty or not
		set.clear();//to remove everything
		System.out.println(set);
		
	}

}
//1.add 2.remove 3.null 4.traversing 