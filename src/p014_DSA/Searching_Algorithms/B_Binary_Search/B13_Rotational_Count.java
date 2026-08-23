package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B13_Rotational_Count {
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println(countRotations(arr));
	}

	private static int countRotations(int[] arr) {
		int pivot = findpivot(arr);
		return pivot + 1;
		
	
	}
	//use this for non duplicates
	static int findpivot(int[] arr) {
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
			if(arr[mid] <= arr[start])
			{
				end = mid -1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	
//	use this for duplicates
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
