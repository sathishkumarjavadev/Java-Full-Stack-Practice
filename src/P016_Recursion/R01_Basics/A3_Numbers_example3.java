package P016_Recursion.R01_Basics;

public class A3_Numbers_example3 {
	
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n)
	{
		if(n==5)//this is the base condition where the recursion will check and return or stop 
		{
			System.out.println(n);
			return;
		}
		else
		{
			System.out.println(n);
			print(n+1);// this is called as the tailed recursion 
		}
	}
}
//function calling another function