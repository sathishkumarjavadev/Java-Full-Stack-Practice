package P016_Recursion.R01_Basics;

public class A15_Count_Steps {
    public static void main(String[] args) {
        int ans = NumberOfSteps(41);
        System.out.println(ans);
    }

    static int NumberOfSteps(int num)
    {
        return helper(num , 0);
    }

    private static int helper(int num , int steps)
    {
        if(num ==0)
        {
            return steps;
        }
        if(num%2==0)
        {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}