package p014_DSA.Searching_Algorithms.A_Linear_Search;

import java.util.Scanner;

public class L01_Linear_Search_Algorithm {
	
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		int arr[] = {1,2 ,4,32 ,4,5,3};
		System.out.println("enter the number to verify");
		int target = obj1.nextInt();
		System.out.println("enter your choice " + 
				"\n Linear Search "+ "\n 1. search by index "+ "\n 2. search by index with greet message "
				+ "\n 3. to check and return true or false"	+ "\n 4. would to like extend one more action? if yes enter 4");
		System.out.println("Enter the target element");
		
			int choice = obj1.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("=============================");
				int SearchByIndex = LinearSearch(arr, target);
				System.out.println("SearchByIndex = "+SearchByIndex);
				System.out.println("=============================");
				};
				break;
			case 2:{
				System.out.println("=============================");
				String SearchByIndexWithGreetMessage = LinearSearch2(arr, target);
				System.out.println("SearchByIndexWithGreetMessage = "+SearchByIndexWithGreetMessage);
				System.out.println("=============================");			
				};
				break;
			case 3:{
				System.out.println("=============================");
				boolean present_or_not = LinearSearch3(arr, target);
				System.out.println("present_or_not = "+present_or_not);
				System.out.println("=============================");
				};
				break;
			case 4:
			{
				
			}
			default:{
				System.out.println("check and enter the choice in the given range");
				};
				break;
				}
	}
	//	return the index 
	static int LinearSearch(int arr[], int target)
		{
			if(arr.length == 0)
			{
				return -1;
			}
			for(int index = 0; index < arr.length ; index++)
			{
	//			int element = nums[index];
				if(arr[index] == target)
				{
					return index;
				}
			}
			return -1;
		}
	//	type 2 : return the value with the string message
		static String LinearSearch2(int arr[], int target)
		{
			if(arr.length == 0)
			{
				return "not found";
			}
			for(int index = 0; index < arr.length ; index++)
	//		below method is using enhanced for loop
	//		for(int index:arr)
			{
				if(arr[index] == target)
				{
					return "element found at index : "+index+" is : " + arr[index];
				}
			}
			return "not found";
		}
		
		
	//	type 3 : return true or false
		
		static boolean LinearSearch3(int arr[], int target) 
		{
			if(arr.length  == 0)
			{
				return false;
			}
			for(int index = 0 ; index<arr.length; index++)
			{
				if (arr[index] == target)
				{
					return true;
				}
			}
			return false;
		}
	}
