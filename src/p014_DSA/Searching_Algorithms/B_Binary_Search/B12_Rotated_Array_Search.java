package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B12_Rotated_Array_Search {

	public static void main(String[] args) {
		int[]arr = {4,5,6,7,0,1,2};
		System.out.println(findpivotwithduplicates(arr));
	}
	
	static int search(int[] nums, int target)
	{
		int pivot = findpivotwithduplicates(nums);
		if(pivot == -1) {
//			just do normal binary search
			return BinarySearch(nums, target, 0, nums.length-1);
		}
//		if pivot has found , you have found 2 asc sorted array
		
		if(nums[pivot] == target) {
			return pivot;
		}
		
		if(target >= nums[0]) {
			return BinarySearch(nums, target, 0, pivot-1);
		}
		return BinarySearch(nums, target, pivot+1, nums.length-1);
	}
	
	static int BinarySearch(int arr[], int target, int start, int end) {
		while(start <= end) {
			int mid = start+(end-start)/2;
			
			if(target<arr[mid]) {
				end = mid -1;
			}
			else if(target>arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int findpivotwithduplicates(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start+(end-start)/2;
//			4 cases 
			if(mid < end && arr[mid] > arr[mid+1]) 
			{
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1])
			{
				return mid-1;
			}
			//if elements at middle , start, end, wnd are equal then just skip the duplicates
			
			if(arr[mid] == arr[start] && arr[mid] == arr[mid]) {
				//skip the duplicates
				//note: what if these elements at start and end were the pivot ?
//				check if start is pivot
				if(arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
//				check whether the end is pivot
				if(arr[end] < arr[end -1]) {
					return end-1;
				}
				end--;
				}
//			left side is sorted , so pivot should be in the right
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[mid])) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			}
		return -1;
	}
}
/*
 
[2,4,5,7,8,9,10,12] - > array 
[12,2,4,5,7,8,9,10] - > first rotated result ( rotation will occur in the clock wise only )
[10,12,2,4,5,7,8,9] - > second rotated result ( rotation will occur in the clock wise only )
 
 
1. find the pivot in the array (pivot is from where the remaining number are in the ascending) 
 example [3,4,5,6,7,0,1,2] 7 is the pivot
*/


/*
 
         Rotated Sorted Array
                 ↓
            Find Pivot
                 ↓
       ┌─────────┴─────────┐
       ↓                   ↓
  Left sorted          Right sorted
       ↓                   ↓
target >= nums[0]?      Otherwise
       ↓                   ↓
 Binary Search        Binary Search
 
 */