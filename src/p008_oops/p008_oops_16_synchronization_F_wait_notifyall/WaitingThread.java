package p008_oops.p008_oops_16_synchronization_F_wait_notifyall;

public class WaitingThread extends Thread
{
	Message msg;
	public WaitingThread(Message msg, String name)
	{
		super(name);
		this.msg = msg;
	}
	
	@Override
	public void run() {
		msg.waitMethod(getName());
	}
}
