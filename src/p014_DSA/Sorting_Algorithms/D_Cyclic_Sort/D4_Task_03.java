package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;
//find the duplicate number
//microsoft and amazon
//input 1,3,4,2,2
//output 2
public class D4_Task_03 {
	public static void main(String[] args) {
	int arr[] = {1,3,4,2,2};
	System.out.println(findduplicate(arr));
	}
	static int findduplicate(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i] != i+1)
			{
				int correct = arr[i]-1;
				if(arr[i]!=arr[correct])
				{
					swap(arr,i,correct);
				}
				else {
					return arr[i];
				}
			} else {
				i++;
			}
		}
		return -1;
	}

	
	static void swap(int [] arr, int first , int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
 
}
