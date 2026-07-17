package p008_oops.p008_oops_16_synchronization_E_wait_notify;

public class NotifyThread extends Thread{
	Message msg;
	
	public NotifyThread(Message msg) {
		this.msg = msg;
	}
	@Override
	public void run() {
		msg.notifymethod();	
	}
}