package P016_Recursion;

public class A10_Mul_of_Digits
{
    public static void main(String[] args) {
        int ans = mul(63);
        System.out.println("Multiplication calling");
        System.out.println(ans);
        System.out.println("pre-decrement calling");
        pre_decrement(5);
        System.out.println("Post-decrement calling");
        post_decrement(5);
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
    static void pre_decrement(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pre_decrement(n-1);
    }
    static void post_decrement(int n)
    {
         if(n==0)
        {
            return;
        }
        System.out.println(n);
        post_decrement(n-1);
    }
}