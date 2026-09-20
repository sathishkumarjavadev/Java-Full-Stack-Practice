package p017_Tasks_and_Practice.T1_Basics;
public class A21_Positive_Even
{
    public static void main(String[] args) {
     pos_eve(48);  
     between(26, 25, 34); 
    }
    static void pos_eve(int number)
    {
        if((number>0)&&((number%2)==0))
        {
            System.out.println("positive even");
        }
        else{
            System.out.println("positive odd");
        }
    }
    static void between(int num, int start, int end)
    {
        if((num>=start)&&(num<=end))
        {
            System.out.println("with in the range");
        }
        else{
            System.out.println("not in the range");
        }
    }
}