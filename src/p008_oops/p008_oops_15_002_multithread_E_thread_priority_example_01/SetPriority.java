package p008_oops.p008_oops_15_002_multithread_E_thread_priority_example_01;

public class SetPriority {
	public static void main(String[] args) {
		MyThread2 obj = new MyThread2();
		obj.setPriority(9);
		// we can set the priority according to our wish from 1 to 10
		obj.setPriority(Thread.MAX_PRIORITY );//it will update the priority value to max
		obj.setPriority(Thread.MIN_PRIORITY);//it will update the priority value to min
		obj.setPriority(Thread.NORM_PRIORITY);//it will update the priority value to the normal or average 
		obj.start();
		
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println(getPriority());
	}
}