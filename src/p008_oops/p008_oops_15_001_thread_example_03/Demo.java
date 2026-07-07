package p008_oops.p008_oops_15_001_thread_example_03;

public class Demo {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
//		we can name our own thread
		obj.setName("sathish thread");
		obj.start();
		obj.run();
		obj.run2();
		
	}
}


//Interview Question
//
//Q: Why did run() execute twice?
//
//First execution: because start() created a new thread, and the JVM called run().
//Second execution: because you directly called run(), 
//which is just a normal method call on the main thread.