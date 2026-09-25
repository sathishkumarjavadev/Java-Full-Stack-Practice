package P016_Recursion.R01_Basics;

public class A11_Pre_and_Post_increment {
      public static void main(String[] args) {
        System.out.println("pre-decrement calling");
        pre_decrement(5);
        System.out.println("Post-decrement calling");
        post_decrement(5);
    }
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
