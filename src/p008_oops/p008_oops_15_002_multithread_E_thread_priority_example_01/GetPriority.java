package p008_oops.p008_oops_15_002_multithread_E_thread_priority_example_01;

public class GetPriority {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
	}
}
class MyThread extends Thread {
	public void run() {
		System.out.println(getPriority());
		
	}
}