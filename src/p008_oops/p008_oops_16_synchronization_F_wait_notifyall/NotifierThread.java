package p008_oops.p008_oops_16_synchronization_F_wait_notifyall;

public class NotifierThread extends Thread
{
	Message msg;
	public NotifierThread(Message msg)
	{
		this.msg = msg;
	}
	@Override
	public void run()
	{
		msg.notifyAllMethod();
	}
}
