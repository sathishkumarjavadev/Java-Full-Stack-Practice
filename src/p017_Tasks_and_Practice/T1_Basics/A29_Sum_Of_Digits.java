package p017_Tasks_and_Practice.T1_Basics;

public class A29_Sum_Of_Digits {
	public static void main(String[] args) {
		sum(1234);
		mul(1234);
	}
	
	static void sum(int num)
	{
		int sum = 0;
		int rem;
		while(num!=0)
		{
			rem = num%10;
			{
				sum = sum+rem;
			}
			num = num/10;
		}
		System.out.println(sum);
	}
	
	static void mul(int num)
	{
		int mul = 1;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			{
				mul = mul*rem;
			}
			num = num/10;
		}
		System.out.println(mul);
	}

}
