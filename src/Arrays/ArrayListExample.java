package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // adding elements to Arraylist
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//
//        System.out.println(list);

        //ArrayList functions
//        list.set(0,99); //changing the elements
//        System.out.println( list.contains(11));
//        list.remove(4);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
    }
}
