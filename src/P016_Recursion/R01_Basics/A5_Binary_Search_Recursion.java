package P016_Recursion.R01_Basics;

public class A5_Binary_Search_Recursion {
    public static void main(String[] args) 
    {
        int arr[] = { 2,4,6,9,22,45,77,89};
        int target = 9;
        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr, target, start, end));   
    }

    static int search(int[] arr, int target , int start, int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start +(end - start) / 2;

        if(arr[mid] == target )
        {
            return mid;
        }
        if(target < arr[mid])
        {
            return search(arr, target, start, mid-1);
        }
        if(target > arr[mid])
        {
            return search(arr, target, mid+1, end);        
        }
        return -1;
    }
}
