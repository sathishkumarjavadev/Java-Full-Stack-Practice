package P016_Recursion;

public class A6_Print_n_to_1_rev {

    public static void main(String[] args) {
        rev(5);
    }
    
    static void rev(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        rev(num-1);
    }
    
}