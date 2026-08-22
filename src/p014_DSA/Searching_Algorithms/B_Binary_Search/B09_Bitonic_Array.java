package p014_DSA.Searching_Algorithms.B_Binary_Search;
public class B09_Bitonic_Array {
	public static void main(String[] args) {
		int arr[] = {3,5,7,8,9,7,6,5,3,2,2};
		int ans = PeakIndexInMountainArray(arr);
		System.out.println(ans);		
	}
	static int PeakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length -1;		
		while(start < end) {
			int mid = start + (end - start) /2;
			if(arr[mid] > arr[mid+1]) {
//				you are in the decreasing part of the array, this may be the answer look at the left, this is why end != mid-1
				end = mid;
			}
			else {
//				you are in the asc part of the array, because we know that mid+1 element is greater than mid element
				start = mid+1;
			}
		}
		return start; // or return end as both are equal 
	}
}
//		in the end , start == end and pointing to the largest number because of the 2 checks above 
//		start and end are always trying to find the max element in the above 2 checks
//		hence, when they are pointing to just one element, that is the max one because that is what the checks say
//		more elaboration : at every point of time for start and end, they have the best possible answer till that time and of we are saying and only one item is remaining , 
//		hence because of above line that is the best possible answer
		
//==========================================================================================

//1,2,3,4,5,6,5,4,3,2,1 - it is like a increasing and decreasing, 
//mountain array
//assume a graph , it will start increasing and start decreasing completely
//example
//    5
//   4 4
//  3   3
// 2     2
//1       1
//ascending and descending
//it will not contains a duplicate element in one part

//==========================================================================================
//B09 — Bitonic/Mountain Array Peak Algorithm
//
//A Bitonic/Mountain array first increases and then decreases, with one peak element.
//
//Use Binary Search to find the peak in O(log n).
//Compare arr[mid] with arr[mid + 1].
//If arr[mid] < arr[mid + 1], we are on the ascending side, so move right: start = mid + 1.
//If arr[mid] > arr[mid + 1], we are on the descending side, so the peak is at mid or to the left: end = mid.
//When start == end, that index is the peak index.
//
//Time: O(log n)
//Space: O(1)