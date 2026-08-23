package p014_DSA.Searching_Algorithms.B_Binary_Search;

public class B14_Split_Array_Largest_Sum {
	public static void main(String[] args) {
		int[] nums= {7,2,5,10,8};
		int ans = splitArray(nums, 4);
		System.out.println(ans);
	}
	
	public static int splitArray(int nums[], int m) {
		int start =0;
		int end =0;
		for(int i=0;i<nums.length;i++)
		{
			start = Math.max(start, nums[i]);//in the end of the loop it will contain the max item in the array
			end = end +nums[i];
		}
		
		//binary search
		while(start < end) {
			//try for the middle as potential answer
			int mid = start +(end-start)/2;
			int sum =0;
			int pieces = 1;
			for(int num:nums) {
				if((sum+num )>mid)
				{
					//you cannor add this in this subarray , make new one
					//say you add this num in new subarray , then sum = num
					sum = num;
					pieces++;
				}
				else {
					sum +=num;
					
				}
			}if(pieces>m) {
				start = mid+1;
			}
			else {
				end= mid;
			}
			
		}
		return end;
	}

}
