package p008_oops.p008_oops_14_exception_handling;

public class A8ThrowExample {
	public static void main(String[] args) {
		int age = 16;
		try {
			if(age < 18)
			{
				throw new ArithmeticException("not eligible to vote");
				}
			System.out.println("eligible to vote");
			}
		catch (ArithmeticException e) 
		{
			System.err.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Program ended");
		}
	}
}