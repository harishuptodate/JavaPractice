package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr2D = new int[3] [3];    // syntax
        /*
              1 2 3
              4 5 6
              7 8 9
        */


        int[][] arr2D = new int[3][3];    // syntax
        arr2D = new int[][]{
                {1, 2, 3}, // 0th index
                {4, 5, 6}, // 1st index
                {7, 8, 9} // 2nd index -> arr2D[2] = {7,8,9}
        };
        //System.out.println(arr2D.length); // prints no of rows i.e, 3 here

        //  To input the array from keyboard
//        for (int row = 0; row < arr2D.length; row++) {
////            for each col in every row
//            for (int col = 0; col < arr2D[row].length; col++) {
//                arr2D[row][col] = in.nextInt();
//            }
//        }
       for (int row = 0; row < arr2D.length; row++) {
           for (int col = 0; col < arr2D[row].length; col++) {
               System.out.print(arr2D[row][col]+ " ");
           }
           System.out.println();
        }
//         Another method to print using Enhanced for loop
         for ( int[] a : arr2D){
             System.out.println(Arrays.toString(a));

        }
    }
}