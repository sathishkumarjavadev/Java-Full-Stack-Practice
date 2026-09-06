package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;
//find all the duplicates


import java.util.*;

public class D5_Task_04 {
	
	public static void main(String[] args) {
	int arrr[] = {4,3,2,7,8,2,3,1};
	System.out.println(findDuplicates(arrr));
	}
	public static List<Integer> findDuplicates(int[] arrr)
	{
		int i=0;
			while(i<arrr.length)
			{
				int correct =arrr[i]-1;
				if(arrr[i] != arrr[correct])
				{
					swap(arrr, i, correct);
				}
				else
				{
					i++;
				}
			}
			
			List<Integer> ans = new ArrayList<>();
			for(int index = 0 ; index<arrr.length;index++)
			{
				if(arrr[index]!=index+1)
{
	ans.add(arrr[index]);
	
}
			}
			return ans;
	}
	static void swap(int [] arr, int first , int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	
 
}
}