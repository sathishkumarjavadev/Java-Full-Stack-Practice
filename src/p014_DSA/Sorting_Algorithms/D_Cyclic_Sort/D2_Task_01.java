package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;

//find the missing number
//question of amazon 
public class D2_Task_01 {
	public static void main(String[] args) {
//		int arr[]= {4,0,2,5,1};
		int arr[] = {4, 0, 2, 6, 1, 3};
		System.out.println(missingnumber(arr));
	}
	
	public static int missingnumber(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correct =arr[i];
			if(arr[i] < arr.length && arr[i] != arr[correct])
			{
				swap(arr, i, correct);
			}
			else
			{
				i++;
			}
		}
		
		//search for the first missing number
		for(int index =0;index<arr.length;index++)
		{
			if(arr[index]!=index)
			{
				return index;
			}
		}
		return arr.length;
	}
	
	static void swap(int [] arr, int first , int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}

/*
 find the max value in the array , and the value is assign it as a end value of the loop , 
 then compare with the existing array values if not print the missing number 
 
 */
