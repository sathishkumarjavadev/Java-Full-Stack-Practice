package P016_Recursion.R01_Basics;

public class A9_Sum_of_Digits {

    public static void main(String[] args) {
        int ans = sum(632);
        System.out.println(ans);
    }

    static int sum(int n)
    {
        if(n==0)
        {
            return n;
        }
         return (n%10)+sum(n/10);
    }
}