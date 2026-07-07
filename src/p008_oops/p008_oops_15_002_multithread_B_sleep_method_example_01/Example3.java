package p008_oops.p008_oops_15_002_multithread_B_sleep_method_example_01;

public class Example3 {
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<=10;i++)
		{
			if(i==10)	{
				System.out.println("bye");;
			}
			else	{
			System.out.println(i);
			}
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}

//The catch block handles the InterruptedException, so throws 
//InterruptedException is not needed for that particular Thread.sleep() call.