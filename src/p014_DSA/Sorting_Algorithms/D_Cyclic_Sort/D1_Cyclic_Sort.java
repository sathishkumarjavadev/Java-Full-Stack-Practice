package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;
import java.util.Arrays;

public class D1_Cyclic_Sort {
	public static void main(String[] args) {
		int arr[]= {3,5,2,1,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correct =arr[i]-1;
			if(arr[i] != arr[correct])
			{
				swap(arr, i, correct);
			}
			else
			{
				i++;
			}
		}
	}
	
	static void swap(int [] arr, int first , int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
//notes:
//	1. this algorithm uses only one for loop or while loop 