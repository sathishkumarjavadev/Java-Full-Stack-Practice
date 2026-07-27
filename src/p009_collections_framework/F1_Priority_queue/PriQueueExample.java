package p009_collections_framework.F1_Priority_queue;

import java.util.PriorityQueue;

public class PriQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		obj.add(2);
		obj.add(5);
		obj.add(30);
		obj.add(21);
		obj.add(30);
		
		//to remove the whole values
		while(!obj.isEmpty())
		{
			System.out.println(obj.poll());
		}
		System.out.println("==============");
		obj.add(2);
		obj.add(5);
		obj.add(30);
		obj.add(21);
		obj.add(30);
		System.out.println("converting object to array and printing the value");
		Object[] arr = obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]= "+arr[i]);
		}
		System.out.println("=====printing ended=====");
//		for traversal using loop
		for(Integer i:obj)
		{
			System.out.println(i);
		}
		System.out.println("===========traversal completed=========");
		
		System.out.println("Queue :" +obj);
		System.out.println("Peek :" +obj.peek());//returns the peek element
		System.out.println("Poll :" +obj.poll());//removes the peek element
		System.out.println("After Poll :"+obj);
		System.out.println(obj.contains(30)); //to check the value
		System.out.println(obj.containsAll(obj));//to check the objects
		System.out.println(obj.size());//to check the size
		obj.clear();//to remove everything in the object
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
	}
}
