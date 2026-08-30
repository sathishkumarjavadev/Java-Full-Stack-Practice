package p014_DSA.Sorting_Algorithms.C_Insertion_Sort;

import java.util.Arrays;

public class C_Insertion_Sort 
{	
	public static void main(String[] args) 
	{
		int arr[] = {9,2,5,6,3,4,1};
		System.out.println(Arrays.toString(insertion(arr)));
	}
	static int[] insertion(int arr[]) 
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
	                arr[j] = arr[j - 1];
	                arr[j - 1] = temp;
				}
				else
				{
					break;
				}
			}
		}
		return arr;
	}
}

//complexity 
//worst case O(N^2)
//best case O(N)


//bubble sort --> every single pass , every largest element goes to the last index
//selection sort --> searching the greater element and putting it in the last index
//insertion sort --> try sorting in the every insertion , the iteration runs for every iteration, 
//it will sort from left to right

//example : [5,3,4,1,2] , i-size of the elements , j - 
//i = 1 , j = 1 {3,5,4,1,2} , j=2 {3,4,5,1,2} , j=3 {3,4,1,5,2} , j=4 {3,4,1,2,5}
//i = 2 , j = 1 {3,4,1,2} , j=2 {3,1,4,2} , j=3 {3,1,2,4}
//i = 3 , j = 1 {1,3,2} , j=2 {1,2,3}
//i = 4 , j = 1 {1,2}


//output 
//[9, 2, 5, 3, 4, 1]
//
//[9] | 2 5 3 4 1
//[2,9] | 5 3 4 1
//[2,5,9] | 3 4 1
//[2,3,5,9] | 4 1
//[2,3,4,5,9] | 1
//[1,2,3,4,5,9]