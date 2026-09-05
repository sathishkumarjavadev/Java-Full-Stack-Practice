package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;

import java.util.Arrays;

//question of amazon 
public class D2_Task_01 {
	public static void main(String[] args) {
		int arr[] = { 4,0,2,1};
		System.out.println(Arrays.toString(missing(arr)));
		
		
		
	}
	
	static int[] missing(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == i)
			{
				System.out.println(arr[i]);
			}
			else {
				int temp;
				temp = arr[i];
				arr[i] = i;
				i = temp;
			}
		}
		return arr;
	}
}
