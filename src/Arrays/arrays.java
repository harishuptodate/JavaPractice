package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 33;
        arr[3] = 43;
        arr[4] = 63;
        // [23, 45, 33, 43, 63]
//        System.out.println(arr[4]);
        //  input using for loops
        for (int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
//        }
//        // different ways to print the array
//        for (int num: arr) {             // for every element in the array, print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }
//        // best inbuilt method/function way to print an array
//        System.out.println(Arrays.toString(arr));   // this converts array into a string

            // array of objects
//            String[] str = new String[3];
//            for (int i = 0; i < str.length; i++) {
//                str[i] = in.next();
//            }
//            System.out.println(Arrays.toString(str));
//
//
//            //modify
//            str[1] = "Harish";
//            System.out.println(Arrays.toString(str));


        }
    }
}
