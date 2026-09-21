package p017_Tasks_and_Practice.T1_Basics;

public class A30_Count_Even_And_Odd_Digits {
	public static void main(String[] args) {
		even_or_odd_count(1283498534);
		
	}
	
	static void even_or_odd_count(int num)
	{
		int even_count=0;
		int odd_count=0;
		int rem;
		while(num!=0)
		{
			rem = num%10;
			{
				if(rem%2 == 0)
				{
					even_count++;
				}
				if(rem%2 != 0)
				{
					odd_count++;
				}
			}
			num = num/10;
		}
		System.out.println("Even numbers count = " + even_count);
		System.out.println("Odd numbers count = " + odd_count);
	}
}