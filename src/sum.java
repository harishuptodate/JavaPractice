import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int num1 = sum.nextInt();
        int num2 = sum.nextInt();
        int total = num1 + num2;
        System.out.println("Sum is " + total);
        byte b = 50;
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
