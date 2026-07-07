package p008_oops.p008_oops_14_exception_handling;

public class Demo 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Program ended");
	}
}