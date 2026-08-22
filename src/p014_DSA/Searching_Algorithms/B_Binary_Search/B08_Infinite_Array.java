package p014_DSA.Searching_Algorithms.B_Binary_Search;
//amazon interview questions
//1. find the position of an element in a sorted array of infinite numbers
//hint : dont divide by 2 , instead multiply by 2
//keep doubling the range to find the target --> 1,2,4,8,16,........
public class B08_Infinite_Array {

	public static void main(String[] args) {
		
		int arr[] = {3,5,7,9,10,100,130,140,160,170};
		int target = 10;
		System.out.println(ans(arr, target));
	}
	static int ans(int arr[], int target) {
//		first find the range
//		first start with the ox of size 2
		int start =0;;
		int end =1;
//		condition for the target to lie in the range
		while(target > arr[end])
		{
			int temp = end + 1;
//			double the box value
//			end = previous and + sizeofbox*2
			end = end + (end - start +1) *2;
			start = temp;
		}
		return BinarySearch(arr, target, start, end);
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
}