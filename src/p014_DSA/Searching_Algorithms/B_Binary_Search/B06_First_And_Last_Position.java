package p014_DSA.Searching_Algorithms.B_Binary_Search;
//facebook interview question
//1. find the first and last index of the number in the sorted array using the binary search
public class B06_First_And_Last_Position {
	public static void main(String[] args) {

	    int nums[] = {5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,10};

	    int target = 8;

	    int[] result = SearchRange(nums, target);

	    System.out.println("First position = " + result[0]);
	    System.out.println("Last position = " + result[1]);
	}
	
	static int[] SearchRange(int[] nums, int target) {
		int [] ans = {-1,-1};
		int start = search(nums,  target,  true);
		int end = search(nums, target, false);
		ans[0]= start;
		ans[1]= end;
		return ans;
}
	
//	this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
	int ans =-1;
	int start = 0;
		int end = nums.length-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target < nums[mid])
			{
				end = mid -1;
			}
			else if(target > nums[mid])
			{
				start = mid+1;
			}
			else {
				ans = mid;
				if(findStartIndex) {
					end = mid -1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return ans;
	}
}