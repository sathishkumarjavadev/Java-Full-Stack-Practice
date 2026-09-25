package P016_Recursion.R01_Basics;

public class A10_Mul_of_Digits
{
    public static void main(String[] args) {
        int ans = mul(63);
        System.out.println("Multiplication calling");
        System.out.println(ans);
    }
    
    static int mul(int n)
    {
        if(n%10 == n)
        { 
            return n;
        }
         return (n%10)*mul(n/10);
    }

    // another important concept is there, here we will learn about the pre and post decrement/increment difference
   
}