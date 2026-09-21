package p017_Tasks_and_Practice.T1_Basics;

public class A32_First_Digit 
{
	public static void main(String[] args)
	{
		num2(3452);
	}
	static void num2(int num)
	{
		while (num >= 10) 
		{
			num = num / 10;
			}
		System.out.println(num);
	}
}
//example
//input - 8374
//output - 8