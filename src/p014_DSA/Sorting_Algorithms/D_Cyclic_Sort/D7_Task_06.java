package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;

//first missing positive(HARD question)
public class D7_Task_06 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,0};//test data 1
		int arr2[] = { 3,4,-1,1};//test data 2
		System.out.println(missingnumber(arr));
		
	}
	public static int missingnumber(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correct =arr[i]-1;
			if(arr[i]>0&&arr[i] <= arr.length && arr[i] != arr[correct])
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
			if(arr[index]!=index+1)
			{
				return index+1;
			}
		}
		return arr.length+1;
	}
	
	static void swap(int [] arr, int first , int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}