package p008_oops.p008_oops_18_thread_safety;

public class Counter {
	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
