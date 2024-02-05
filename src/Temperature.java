
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in F ");
        float f = input.nextFloat();
        float C =  (f - 32) * 5/9;
        System.out.println(C);

        }
    }

