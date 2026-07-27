package p009_collections_framework.A5_array_list_sorting;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

public class SortStringExample {

	public static void main(String[] args) {
		 ArrayList<String> obj = new ArrayList<String>();
		 //values are stored in the object 
		 obj.add("e");
		 obj.add("d");
		 obj.add("c");
		 obj.add("a");
		 obj.add("b");
		 
		 System.out.println("before sorting");
		 for(String i:obj) {
			 System.out.println(i);
		 }
		 System.out.println("after sorting");
		 Collections.sort(obj);// we are sorting the object
		 for(String j:obj) {
			 System.out.println(j);
		 }
	}
}
