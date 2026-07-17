package p008_oops.p008_oops_16_synchronization_E_wait_notify;

public class Message 
{
	public synchronized void waitmethod() 
	{
		System.out.println("Thread A : Waiting...");
		try {
			wait();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread A : Continued...");
	}
	public synchronized void notifymethod()
	{
		System.out.println("Thread B : Notifying...");
		notify();
		System.out.println("Thread B : Notification sent...");
	}
}
