package p017_Tasks_and_Practice.T1_Basics;
public class A22_Count_Digits {

    public static void main(String[] args) {
        nums_length();
        nums_length2();
    }
    
    static void nums_length()
    {
        int num = 2423;
        System.out.println("using the length function");
        String num_length = String.valueOf(num);
        System.out.println(num_length.length());   
    }   

    static void nums_length2()
    {
        System.out.println("without using the length function");
        int num = 342323;
        int count = 0;
        while(num!=0 )
        {
            num= num/10;
            count = count+1;
        }
        System.out.println(count);
    }
}