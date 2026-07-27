package p009_collections_framework.B1_LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("a");//method 1 
		obj.add("b");//method 1 
		obj.add("c");//method 1 
		obj.add("d");//method 1 
		obj.add("e");//method 1 
		obj.add("f");//method 1 
		obj.add("g");//method 1 
		System.out.println(obj+" <--add");
		obj.add("h");
		System.out.println(obj+" <--add");
		obj.addFirst("i");//method 2
		System.out.println(obj+" <--add first");
		obj.addLast("j");//method 3
		System.out.println(obj+" <--add last");
		obj.remove();//method 4
		System.out.println(obj+" <--remove");
		obj.removeFirst();//method 5
		System.out.println(obj+" <--removefirst");
		obj.removeLast();//method 6
		System.out.println(obj+" <--removelast");
		System.out.println(obj.peek());//method 7 returns the top element
//		method 8 poll() returns the first element and removes it.
		System.out.println(obj.poll());
	}

}
