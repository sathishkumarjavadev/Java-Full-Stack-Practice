package p008_oops.p008_oops_14_exception_handling;

public class A1ArithmeticExceptiom 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a = 10/0;
			System.out.println(a);
		} 
		catch (Exception e) 
		{
			System.out.println("cannot divide by zero");
		}
		System.out.println("program ended");
	}
}
