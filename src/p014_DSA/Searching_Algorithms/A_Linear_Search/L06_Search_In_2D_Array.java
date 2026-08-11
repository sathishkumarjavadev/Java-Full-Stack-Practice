package p014_DSA.Searching_Algorithms.A_Linear_Search;

import java.util.Arrays;

public class L06_Search_In_2D_Array {
	
	public static void main(String[] args) {
/*
        col
         0    1    2    3
       ┌────────────────────
row 0  │ 28   4    1
row 1  │ 18   12   3    9
row 2  │ 78   99   34   56
row 3  │ 18   21		
	
*/
	int arr[][] = {
			{28,	4,	1},
			{18,	12,	3,	9},
			{78,	99,	34,	56},
			{18,	21}
			};
	int target = 34;
	System.out.println(arr.length);
	System.out.println(Arrays.toString(search23(arr, target)));//it is returning the object , we convert to array
//	System.out.println(search23(arr, target));
	System.out.println(max(arr));
	}


	static int[] search23(int arr[][], int target) {
		
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				if(arr[row][col] == target)
				{
					return new int[]{row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	static int max(int arr[][])
	{
		int max = arr[0][0];
		for(int row=0; row<arr.length; row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col] > max)
				{
					max = arr[row][col];
				}
			}
		}
		return max;
		
	}
}