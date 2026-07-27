package p009_collections_framework.A5_array_list_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(4);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("before sorting ");
		for(int i:numbers) {
			System.out.println(i);
		}
		System.out.println("removing 3rd index");
		numbers.remove(3);
		
		System.out.println("-----------------");
		System.out.println("after sorting");
		Collections.sort(numbers);
		for(int i:numbers) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		Collections.reverse(numbers);
		System.out.println("reverse");
		for(int i:numbers) {
			System.out.println(i);
		}
		System.out.println("-----------------");
	}
}
