package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B04_Floor {
	public static void main(String[] args) {
		int arr[] = {2,3,5,9,14,16,18};
		int target = 15;
		System.out.println("the total length of the array is : "+arr.length);
		System.out.println(floor(arr, target));
	}
//	floor --> number <= target
	static int floor(int arr[], int target) {
//		if the target is greater than the greatest element in the araay , it will return -1
		if(target > arr[arr.length-1])
		{
			return -1;
		}
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
		return end;
	}
}
