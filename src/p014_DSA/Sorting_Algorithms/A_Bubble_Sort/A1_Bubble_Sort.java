package p014_DSA.Sorting_Algorithms.A_Bubble_Sort;

import java.util.Arrays;

public class A1_Bubble_Sort {
	public static void main(String[] args) {
		int arr[] = {8,6,3,7,5,2,9};
		bubble(arr);
		}
	
	static void bubble(int arr[])
	{
		for(int i=0;i<arr.length;i++) {//7,6,5,4,3,2,1 length inc
			for(int j=1;j<arr.length-i;j++)//(1,2,3,4,5,6),(1,2,3,4,5),(1,2,3,4),(1,2,3),(1,2),(1) length dec
			{
				if(arr[j]<arr[j-1])
				{
					int temp;
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
//					System.out.println("temp="+i+"th iteration , value =  "+temp);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
//hints: in every step we are comparing the adjacent elements
//in the first iteration we will get the first largest element at the end 
//it will sort the element in the reverse order only
//it is also known as sinking sort 
//it is also known as exchanging sort
//space complexity - > constant - > no extra space required - > O(1)
//big o notation - > best case O(N), worst case O(N^2)
