package p014_DSA.Searching_Algorithms.A_Linear_Search;

import java.util.Scanner;

public class L03_Search_In_Range {
	
	public static void main(String[] args) {
		
		int[] arr = {4,6,2,7,8,3,5,2,8,7,9};
		Scanner obj = new Scanner(System.in);
		
		System.out.println("we are going to create an sub array , just enter the start index and end index");
		System.out.println("total length of the array is = " + arr.length);
		System.out.println("enter the start index = ");		
		int startindex = obj.nextInt();
		System.out.println("enter the end index = ");
		int endindex=obj.nextInt();
		System.out.println("enter the target elemnt = ");
		int target=obj.nextInt();
		
		System.out.println(Linear_Search_In_Range(arr, target, startindex, endindex));
		obj.close();
	}
	
	static String Linear_Search_In_Range(int[] arr, int target, int start, int end ) {
		
		if(arr.length <= 0)
		{
			return "Array is empty";
			}
		if(start < 0 || end >= arr.length || start > end)
		{
			return "invalid range";
			}
		for(int index=start; index<=end; index++)
		{
			if(arr[index] == target)
			{
				return target + " found at index : " + index;
				}
			}
		return "not found";
		}
}
