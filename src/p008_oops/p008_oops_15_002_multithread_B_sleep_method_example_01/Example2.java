package p008_oops.p008_oops_15_002_multithread_B_sleep_method_example_01;

public class Example2 
{
	public static void main(String[] args)
	{
		try {
			System.out.println("start");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");		
	}
}

//same example one is used with error handling 

//Why?
//Suppose Thread A is sleeping for 10 seconds.
//Another thread can interrupt it before the 10 seconds finish.
//Java signals this by throwing an: InterruptedException