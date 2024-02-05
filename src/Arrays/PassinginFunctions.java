package Arrays;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
    int[] num = {0,105,4048};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr) {
        arr[0]= 944;
    }

}
