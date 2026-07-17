package p008_oops.p008_oops_16_synchronization_F_wait_notifyall;

public class Message {
	public synchronized void waitMethod(String threadName) {
		System.out.println(threadName + " is waiting...");
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(threadName + "resumed Execution");
	}
	public synchronized void notifyAllMethod() {
		System.out.println("Notifier Thread : Calling notifyAll()");
		notifyAll();
		System.out.println("Notifier Thread : All waiting threads are notified");
	}
}
