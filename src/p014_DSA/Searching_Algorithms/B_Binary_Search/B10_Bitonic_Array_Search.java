package p014_DSA.Searching_Algorithms.B_Binary_Search;
public class B10_Bitonic_Array_Search {
	public static void main(String[] args) {
		int arr[] = {3,5,7,8,9,11,13,7,6,5,3,2,2};
		int ans = PeakIndexInMountainArray(arr);
		System.out.println(ans);		
	}
	static int search(int[] arr, int target) {
		int peak = PeakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
		if(firstTry != -1) {
			return firstTry;
		}
		//try to search in second half
		return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
		
	}
	static int PeakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length -1;		
		while(start < end) {
			int mid = start + (end - start) /2;
			if(arr[mid] > arr[mid+1]) {

				end = mid;
			}
			else {

				start = mid+1;
			}
		}
		return start;  
	}
	static int orderAgnosticBinarySearch(int arr[], int target, int start, int end) {
		if(arr.length == 0 )
		{
			return -1;
		}
		boolean isAsc = arr[start]<arr[end];
		while(start<=end)
		{
			int mid = start +(end - start)/2;// to find the middle element 
			if(arr[mid] == target) 
			{
				return mid;
			}
			if(isAsc) 
			{
				if(target < arr[mid]) 
				{
					end = mid -1;
				}
				else 
				{
					start = mid + 1;
				}
			}
			else 
			{
				if(target > arr[mid]) 
				{
					end = mid -1;
				}
				else 
				{
					start = mid + 1;
				}
			}
		}
		return -1;
		}
	}

/*

Bitonic Array
↓
Find Peak
↓
Search Ascending Half
↓
Not Found?
↓
Search Descending Half
↓
Target Found / -1

*/