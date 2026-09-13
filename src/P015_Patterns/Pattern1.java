package P015_Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		patterns1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern7(5);
		pattern8(5);
		
	}
	
	static void patterns1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pattern1 completed");
	}
//	*****
//	*****
//	*****
//	*****
//	*****

	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pattern2 completed");
	}
//	*
//	**
//	***
//	****
//	*****

	static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pattern3 completed");
	}
//	*****
//	****
//	***
//	**
//	*

	static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		System.out.println("pattern4 completed");
	}
//	1
//	12
//	123
//	1234
//	12345
	static void pattern5(int n)
	{
		for(int i=1;i<(2*n);i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else 
			{
				for(int j=((2*n)-i);j>0;j--)
				{
					System.out.print("*");
				}
				System.out.println();
					
			}
		}
		System.out.println("pattern5 completed");
	}
	
	/*	pattern5 output n=5
	1*
	2**
	3***
	4****
	5*****
	6****
	7***
	8**
	9*
*/
	static void pattern6(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("pattern6 completed");
	}
//	pattern6 output n=5
//	    *
//	   **
//	  ***
//	 ****
//	*****
	
	static void pattern7(int n)
	{
		for(int k=1;k<=n;k++)
		{
			for(int j=1;j<k;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<n-k+2;i++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("pattern7 completed");
	}
			
			
//	pattern7 output n=5
//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	
//	pattern8 output n=5
//    * //4 spaces, 1 star
//   * * //3 spaces , 3 star 
//  * * * //2 spaces , 5 star
// * * * * //1 spaces , 7 star
//* * * * * //0 spaces , 9  star
// * * * * //1 spaces , 7 star
//  * * * //2 spaces , 5 star
//   * * //3 spaces , 3 star
//    * //4 spaces , 1 star
	
	static void pattern8(int n)
	{
	    // i defines the number of rows
	    // j defines the number of spaces in the row
	    // k defines the number of elements in the row
	    // n = 5

	    for(int i = 1; i <= (2 * n) - 1; i++)
	    {
	        if(i <= n)
	        {
	            // Top half

	            // Spaces
	            for(int j = n - i; j > 0; j--)
	            {
	                System.out.print(" ");
	            }

	            // Stars and spaces
	            for(int k = 1; k <= ((2 * i) - 1); k++)
	            {
	                if(k % 2 == 1)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }

	            System.out.println();
	        }
	        else
	        {
	            // Bottom half

	            // Spaces
	            for(int j = 1; j <= i - n; j++)
	            {
	                System.out.print(" ");
	            }

	            // Stars and spaces
	            for(int k = 1; k <= ((2 * ((2 * n) - i)) - 1); k++)
	            {
	                if(k % 2 == 1)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }

	            System.out.println();
	        }
	    }
	    System.out.println("pattern8 completed");
	}
	}