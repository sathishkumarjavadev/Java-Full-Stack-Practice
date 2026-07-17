package p008_oops.p008_oops_16_synchronization_F_wait_notifyall;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		
		Message msg = new Message();
		
		WaitingThread t1 = new WaitingThread(msg, "Thread-A");
		WaitingThread t2 = new WaitingThread(msg, "Thread-B");
		WaitingThread t3 = new WaitingThread(msg, "Thread-c");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(3000);
		
		NotifierThread notifier = new NotifierThread(msg);
		notifier.start();
		
	}

}
//Why?
//
//After notifyAll():
//
//Thread A → READY
//Thread B → READY
//Thread C → READY
//
//All threads are notified, but they still need the same lock.
//
//Since there is only one lock, only one thread can enter the synchronized block at a time.
//
//Example:
//
//notifyAll()
//
//↓
//
//Thread A → READY
//Thread B → READY
//Thread C → READY
//
//↓
//
//Thread B gets the lock
//
//↓
//
//Runs
//
//↓
//
//Releases the lock
//
//↓
//
//Thread C gets the lock
//
//↓
//
//Runs
//
//↓
//
//Releases the lock
//
//↓
//
//Thread A gets the lock
//
//↓
//
//Runs
//
//This is exactly what happened in your program:
//
//Thread-B resumed execution.
//Thread-C resumed execution.
//Thread-A resumed execution.
//
//If all threads had entered simultaneously, synchronization would fail completely. 
//The purpose of synchronization is to allow only one thread into the critical section at a time.