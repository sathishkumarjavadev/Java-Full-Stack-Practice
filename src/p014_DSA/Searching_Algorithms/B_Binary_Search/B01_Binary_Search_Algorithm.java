package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B01_Binary_Search_Algorithm {
	
	public static void main(String[] args) {
		int arr[] = {-90,-80,-70,-50,3,5,7,23,65,78,232,756,888};
		int target = 888;
		System.out.println("the total length of the array is : "+arr.length);
		System.out.println(BinarySearch(arr, target));
	}
	
	static int BinarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
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
}