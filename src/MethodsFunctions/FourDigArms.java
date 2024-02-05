import java.util.Scanner;
public class FourDigArms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        if (isFourDigitArmstrongNumber(number)) {
                System.out.println(number + " is a 4-digit Armstrong number.");
            } else {
                System.out.println(number + " is not a 4-digit Armstrong number.");
            }
    }

        // Function to check if a number is a 4-digit Armstrong number
        static boolean isFourDigitArmstrongNumber(int num) {
            if (num < 1000 || num > 9999) {
                // Not a 4-digit number
                return false;
            }

            int originalNumber = num;
            int sum = 0;
//            int numberOfDigits = 4;

            while (num > 0) {
                int digit = num % 10;
                sum += digit*digit*digit*digit;                    //Math.pow(digit, numberOfDigits);
                num /= 10;
            }
        return sum == originalNumber;
        }
}

