package p009_collections_framework.G1_DeQueue;

import java.util.ArrayDeque;

public class DeQueExample {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> obj = new ArrayDeque<Integer>();
		
		obj.addFirst(10);
		obj.addFirst(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(30);
		obj.offerFirst(30);
		obj.offerLast(30);
		obj.addLast(39);
		obj.addLast(43);
		
		//printing the values
		System.out.println("before removal");
		System.out.println(obj);
		System.out.println("after removing first");
		obj.removeFirst();
		System.out.println(obj);
		System.out.println("removing last");
		obj.removeLast();
		System.out.println(obj);
		System.out.println("same as remove 'poll is used' ");
		obj.poll();//removes first element
		System.out.println(obj);
		obj.pollFirst();
		System.out.println(obj);
		obj.pollLast();
		System.out.println(obj);
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		
	}

}
/*
 What is Deque?
Deque stands for Double Ended Queue
It allows insertion and deletion from both ends.

Normal Queue:
Front                 Rear
10 → 20 → 30 → 40
Add → Rear
Remove → Front

Deque:
Front                         Rear
10 ←→ 20 ←→ 30 ←→ 40
Add ✓        Add ✓
Remove ✓     Remove ✓
So,
Front  ← Add
Front  ← Remove

Rear   ← Add
Rear   ← Remove

Important Methods
Add Methods
Front --> addFirst(), offerFirst()		
Rear --> addLast(), offerLast()

Remove Methods
Front --> removeFirst(), pollFirst()		
Rear --> removeLast(), pollLast()

View Methods
Front --> getFirst(), peekFirst()
Rear --> getLast(), peekLast() 

Notice the pattern:
Front --> addFirst(), removeFirst(), peekFirst()
Rear --> addLast(), removeLast(), peekLast()
 */