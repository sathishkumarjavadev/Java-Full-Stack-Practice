package p014_DSA.Searching_Algorithms.A_Linear_Search;

public class L07_Even_Digits {
	
	public static void main(String[] args) {
		int num[] = {18,124,9,1764,98,1, 00,-8348};
		
		System.out.println("The total number of even digits present are :"+findNumbers(num));
	
	}
	static int findNumbers(int[] nums) {
		int count =0;
		for(int num1:nums) {
			if(even(num1)) {
				count++;
				System.out.println("the even digit is :"+ num1);
			}
		}
		
		return count;
	}
	//function to check evendigit or not 
	static boolean even(int num) {
		int numberofdigits = digits(num);
		if(numberofdigits % 2 ==0) {
			System.out.println("the total nnumber of digit is :"+ numberofdigits);
			return true;		
		}
		return false;	
//		return numberofdigits % 2 == 0;
	}
	
//count number of digits in a number
	static int digits(int num) {
	    if(num == 0) {
	        return 1;
	    }
	    if(num<0) {
	    	num = num*(-1);
	    }
	    num = Math.abs(num);
	    int count =0;
		while(num>0)
		{
			count++;
			
			num = num/10;
		}
		return count;
	}
}
