import java.util.Scanner;

public class MethodsFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your message ");
        String YourName = in.next();
        String use = wish(YourName);
       // String ntg = in.next();
      //  String us = wish(ntg);
        System.out.println(use);
    }

     static String wish(String nam) {
          String ntg = "hello ra " + nam;
         return ntg;
    }
}
