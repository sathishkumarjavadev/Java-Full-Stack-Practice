package p017_Tasks_and_Practice.T1_Basics;

public class A23_Count_Digits2 {
    
    public static void main(String[] args) {
        int arr[] = { 123, 33, 2123, 34, 53, 5343};
        for(int i=0;i<arr.length;i++)
        {
            two_digit_num(arr[i]);
        }       
    }
    static void two_digit_num(int num)
    {
        int count =0;
        int original_num = num;
        while(num!=0)
        {
            num = num/10;
            count = count+1;
        }
        if(count==2)
        {
            System.out.println(original_num + " is a two digit number ");
        }
        else{
            System.out.println(original_num + " is not a even digit number ");
        }
    }
}