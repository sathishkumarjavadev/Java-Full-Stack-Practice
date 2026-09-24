package P016_Recursion;

public class A4_Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		System.out.println(fibo(0));
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
		System.out.println(fibo(4));
		System.out.println(fibo(5));
		System.out.println(fibo(6));
		System.out.println(fibo(7));
		System.out.println(fibo(8));
		System.out.println(fibo(9));
	}
		
	static int fibo(int n)
	{
		if(n<2)
		{
			return n;
		}
		
		return fibo(n-1)+fibo(n-2);
	}
}
		
//output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ............
//index  : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, .......

//fibo(n) = fibo(n-1)+fibo(n-2)

/*
recursion tree example for the fibonacci series

fibo(n)

input n = 5
use formula ->  fibo(n) = fibo(n-1)+fibo(n-2)

fibo(5) = fibo(4)+fibo(3)
fibo(4) = fibo(3)+fibo(2)
fibo(3) = fibo(2)+fibo(1)
fibo(2) = fibo(1)+fibo(0)
fibo(1) = fibo(0)+fibo(-1)
fibo(0) = fibo(-1)+fibo(-2)
....
...
..
.
*/