package p008_oops.p008_oops_14_exception_handling;

public class Practice {

    public static void main(String[] args) {

        String value = "12A";

        try {
            int num = Integer.parseInt(value);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        } finally {
            System.out.println("Done");
        }
    }
}