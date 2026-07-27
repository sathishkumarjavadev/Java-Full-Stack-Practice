package p009_collections_framework.E1_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> queueobj = new LinkedList<String>();
		queueobj.add("a");
		System.out.println(queueobj);
		queueobj.add("n");
		System.out.println(queueobj);
		queueobj.add("e");
		System.out.println(queueobj);
		queueobj.add("h");
		System.out.println(queueobj);
		queueobj.add("t");
		System.out.println(queueobj);
		queueobj.add("g");
		System.out.println(queueobj);
		queueobj.remove();
		System.out.println(queueobj);
		queueobj.offer("s");
		System.out.println(queueobj);
//		Looks exactly like add().
//		So what's the difference?
//		Difference
//		add()
//		If insertion fails,
//		it throws an exception.
//		IllegalStateException
//		offer()
//		If insertion fails,
//		it simply returns
//		false
//		instead of throwing an exception.
		
		System.out.println(queueobj.element());
//		It only looks at the front.
//		It doesn't remove it.
		System.out.println(queueobj.peek());
		System.out.println(queueobj.poll());
		//poll also removes from the front
	}
}
//Queue Methods
//Method	Purpose
//add()	Insert at the rear
//offer()	Insert safely
//remove()	Remove from the front
//poll()	Remove safely
//element()	View front
//peek()	View front safely

//PriorityQueue<Integer>
//
//↓
//
//Smallest Number
//	
//↓
//
//Highest Priority