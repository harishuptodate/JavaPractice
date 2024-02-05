import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {  // make 1000, 10000 for 4 digit armstrong numbers
            if (Armstrong(i)) {
                System.out.println(i + " is an armstrong number ");
            }
        }
    } // Function to check first 3-digit Armstrong numbers
     static boolean Armstrong(int n) {
        int org = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem; // * rem, for 4 digit armstrong numbers
        }
        if ( sum == org) {
            return true;
        }                   // you can also write this, if statement like this,
        return false;       //return (sum == org);
     }
}
