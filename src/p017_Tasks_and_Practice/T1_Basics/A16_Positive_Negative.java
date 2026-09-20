package p017_Tasks_and_Practice.T1_Basics;

public class A16_Positive_Negative {
    public static void main(String[] args) {
        pos_neg_zero(8);
        pos_neg_zero(-3);
        pos_neg_zero(0);
        pos_neg_zero(3);
    }
static void pos_neg_zero(int num)
{
    if(num==0)
    {
        System.out.println("zero");
    }
    else if(num>0)
    {
        System.out.println("positive");
    }
    else
        {
        System.out.println("Negative");
    }
}
}
