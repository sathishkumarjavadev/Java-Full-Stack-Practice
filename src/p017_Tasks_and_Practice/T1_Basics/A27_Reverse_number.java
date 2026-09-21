package p017_Tasks_and_Practice.T1_Basics;

public class A27_Reverse_number 
{
	public static void main(String[] args) 
	{
		reversing(425);
	}
	
	static void reversing(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			int rem;
			rem = num%10;
			{
				rev = (rev*10)+rem;
			}
			num = num/10;
		}
		System.out.println(rev);
	}
	
}
		
//static void SmallestDigit(int num)
//{
//	int min=num;
//	while(num!=0)
//	{
//		int digit = num%10;
//		if(digit < min)
//		{
//			min = digit;
//		}
//		num = num/10;  
//	}
//	System.out.println(min);
//}

