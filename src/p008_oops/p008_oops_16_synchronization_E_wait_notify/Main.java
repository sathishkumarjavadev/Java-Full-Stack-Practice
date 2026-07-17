package p008_oops.p008_oops_16_synchronization_E_wait_notify;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Message msg = new Message();
		
		WaitingThread t1 = new WaitingThread(msg);
		NotifyThread t2 = new NotifyThread(msg);
		
		t1.start();
		Thread.sleep(3000);
		t2.start();
		
	}
}
//⭐ Golden Rule
//
//Remember this sentence:
//
//"notify() only wakes threads that are already waiting."

//Interview Tip ⭐⭐⭐⭐⭐
//
//If an interviewer asks:
//
//"Does notify() remember previous notifications?"
//
//Answer:
//
//No. notify() only wakes threads that are currently in the WAITING state. 
//If no thread is waiting, the notification is lost.

//==============================================================
//Suppose:
//
//WAITING Queue
//
//Thread A
//Thread B
//Thread C
//
//After:
//
//notifyAll();
//
//All three threads are notified.
//
//But here's the important part...
//
//⭐ Does notifyAll() make all threads run simultaneously?
//
//No.
//
//Remember our synchronization rule.
//
//Only one thread can own the lock at a time.
//
//So after notifyAll():
//
//Thread A → READY
//Thread B → READY
//Thread C → READY
//
//Then:
//
//Thread A gets the lock
//
//↓
//
//Runs
//
//↓
//
//Releases lock
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
//Releases lock
//
//↓
//
//Thread C gets the lock
//
//They are all notified, but they still execute one by one because there is only one lock.
//
//Memory Trick ⭐⭐⭐⭐⭐
//notify()
//
//↓
//
//Wake One Friend
//notifyAll()
//
//↓
//
//Wake Everyone
//
//But...
//
//Bathroom 🚪
//
//Only One Person Can Enter
//
//Even if everyone wakes up, only one person can enter the bathroom at a time.
//
//That's exactly how synchronized blocks work.
//
//Interview Comparison
//
//| `notify()`                                  | `notifyAll()`                        |
//| ------------------------------------------- | ------------------------------------ |
//| Wakes one waiting thread                    | Wakes all waiting threads            |
//| JVM chooses which one                       | All become eligible to run           |
//| One thread continues after getting the lock | They compete for the lock one by one |
