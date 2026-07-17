package p008_oops.p008_oops_17_deadlock;

public class DeadlockExample 
{
	public static void main(String[] args) 
	{
		final Object lock1 = new Object();
		final Object lock2 = new Object();
		
		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1 acquired Lock 1");
				try {
					Thread.sleep(100);
					}
				catch (InterruptedException e) {
					e.printStackTrace();
	                }
				System.out.println("Thread 1 waiting for Lock 2");
				synchronized (lock2) {
					System.out.println("Thread 1 acquired Lock 2");
					}
				}
			}
		);
		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread 2 acquired Lock 2");
				try {
	                    Thread.sleep(100);
	                    } 
				catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
				System.out.println("Thread 2 waiting for Lock 1");
				synchronized (lock1) {
					System.out.println("Thread 2 acquired Lock 1");
					}
				}
			});
		t1.start();
		t2.start();
		}
	}