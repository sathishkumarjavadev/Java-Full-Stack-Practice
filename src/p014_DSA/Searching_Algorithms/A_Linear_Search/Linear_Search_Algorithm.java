package p014_DSA.Searching_Algorithms.A_Linear_Search;

public class Linear_Search_Algorithm {
	
	public static void main(String[] args) {
		int arr[] = {1,2 ,4,32 ,4,5,3};
		int target = 2;
		int SearchByIndex = LinearSearch(arr, target);
		System.out.println("SearchByIndex = "+SearchByIndex);
		System.out.println("=============================");
		String SearchByIndexWithGreetMessage = LinearSearch2(arr, target);
		System.out.println("SearchByIndexWithGreetMessage = "+SearchByIndexWithGreetMessage);
		System.out.println("=============================");
		boolean present_or_not = LinearSearch3(arr, target);
		System.out.println("present_or_not = "+present_or_not);
		System.out.println("=============================");
		
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
