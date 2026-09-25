package P016_Recursion.R02_Advanced;

public class Array_Sorted {

    public static void main(String[] args) {
        int arr[] = {3,5,7,9,12};
        isSorted(arr);
        // 0   1   2   3   
        // 1   2   3   4
    }
    
    static String isSorted(int[] arr)
    {
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("not sorted");
                break;
            }
        }
        return "sorted";
    }
}
