package p014_DSA.Sorting_Algorithms.B_Selection_Sort;

import java.util.Arrays;

public class B1_Selection_Sort {
	
	public static void main(String[] args) {
		int[] arr = {5,3,6,8,2};
		Selection(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Selection(int[] arr)
	{
//		find the maximum element in the remaining array and swap it with the last index
		for(int i=0;i<arr.length;i++) 
		{
			int last=arr.length-i-1;
			int maxindex = getMaxIndex(arr, 0, last);
			swap(arr,maxindex,last);
			
		}
	}
	static void swap(int arr[], int first, int second) {
		
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}
	
	
	private static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for(int i=start; i<=end; i++) {
			if(arr[max] < arr[i]) {
				max = i;//it will store the index not the value
				System.out.println(arr[max]+" after the " + i + " iteration");
			}
		}
		return max;
	}
}


/*
 time complexity O(n^2)
 
 best and worst case are same
 
 hint : find the max element and put it in the last 
 
 for every iteration , the max index only stored , not the value
  
 */
