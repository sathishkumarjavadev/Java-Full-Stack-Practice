package P016_Recursion.R01_Basics;

public class A12_Reverse_Recursion {
    

    static int sum = 0;
    static void revnum(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        revnum(n/10);
    }
    public static void main(String[] args) {
        revnum(123);
        System.out.println(sum);
    }
}
