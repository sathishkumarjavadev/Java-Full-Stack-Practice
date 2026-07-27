package p009_collections_framework.J1_Tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
	
		TreeSet<Integer> set = new TreeSet<>();
		set.add(40);//adds the element
		set.add(84);
		set.add(74);
//		set.add(null);
		set.add(43);
		set.add(32);
			
//		TreeSet automatically keeps everything sorted.
		System.out.println(set);
		set.remove(32);//removes the element
		System.out.println(set);
		System.out.println(set.contains(74));//returns true or false 
		System.out.println(set.size());//returns the size
		System.out.println(set.isEmpty());//returns true or false
		System.out.println(set.first());//returns the first element
		System.out.println(set.last());//returns the largest element
		System.out.println(set.higher(40));//returns the next greater element
		System.out.println(set.lower(40));//returns the next lower element
		
		System.out.println(set.ceiling(25));//Returns the given element if present, otherwise the next greater element.
		System.out.println(set.floor(25));//Returns the given element if present, otherwise the next smaller element.
		Iterator<Integer> obj = set.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		set.clear();//removes every element in the object and keep the object alive
		
	}
}