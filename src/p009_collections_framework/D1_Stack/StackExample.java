package p009_collections_framework.D1_Stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> obj = new Stack<>();
		
		obj.push("b");
		obj.push("e");
		obj.push("a");
		
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.empty());
		System.out.println(obj.search("a"));
	}

}
