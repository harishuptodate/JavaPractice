import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(20, 30, "Harish","kunal");
    }
     static void multiple(int a, int b, String...v) {
    }
    static void fun(int...v) {
         System.out.println(Arrays.toString(v));
    }
}
