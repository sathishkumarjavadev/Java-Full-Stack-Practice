package p008_oops.p008_oops_15_002_multithread_F_thread_information_method_example_01;
public class Demo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThread t2 = new MyThread();
		t.setName("DownloadThread");		
//		 true → Thread has started and has not finished yet.
//		 false → Thread has not started yet, or it has already finished.
		 System.out.println(t.isAlive());
		 t.start();
		 System.out.println(t.isAlive());
		 t2.start();
		 Thread.currentThread().setName("i am main thread");
		 System.out.println(Thread.currentThread());//msin thread
//		output:
//		Thread[main,5,main]
//		        │    │  │
//		        │    │  └── Thread Group
//		        │    └───── Priority
//		        └────────── Thread Name
		 System.out.println(Thread.currentThread().getName());
// getName() --> This returns the name of the current thread.	
	}
}
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
/* 
Thread Information Methods
 - These methods are used to get information about a thread and are very useful for debugging and logging.

We'll learn:
currentThread() --> It returns the thread that is currently executing.
getName() --> 
setName()
isAlive()
 */



//interview questions

//1. Which method returns the current thread?
//
//✅
//
//Thread.currentThread();
//2. Which method changes the thread's name?
//
//✅
//
//setName();
//3. What is the default name of the main thread?
//
//✅
//
//main
//4. What is the default priority of the main thread?
//
//✅
//
//5
//5. What does isAlive() return?
//
//✅
//
//true → Thread is alive.
//false → Thread is not alive.