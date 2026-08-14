package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B02_Order_Agnostic_BS {
	public static void main(String[] args) {
		int []arr = {9,8,7,6,5,4,3,2,1};
		int target = 3;
		int answer = orderAgnosticBinarySearch(arr, target);
		System.out.println(answer);
	}
	
	static int orderAgnosticBinarySearch(int arr[], int target) {
		if(arr.length == 0 )
		{
			return -1;
		}
		int start = 0 ; 
		int end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		while(start<=end) {
			int mid = start +(end - start)/2;// to find the middle element 
			if(arr[mid] == target) {
				return mid;
			}
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				}
				else {
					start = mid + 1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid -1;
				}
				else {
					start = mid + 1;
				}
				
				
			}
		}
		return -1;		
	}
}