package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 5, 6, -5102};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums) {
            if(even(num)){
              count++;
            }
        }
        return count;
    }
//    checking whether the number is even
     static boolean even(int num) {
         int NumOfDigits = digits(num);
         /*
         if(NumOfDigits % 2 == 0) {
         return true;
     }
        return false;
          */
         return NumOfDigits % 2 == 0;  // simplified if
     }

    // counting the number of digits in a number
     static int digits2(int num){
         if ( num<0){                 // makes a negative num into positive
             num= num* -1;
         }
         return (int) (Math.log10 (num)) + 1; // shortcut to find out number of digits in a given number
     }





    static int digits(int num){
        if ( num<0){                 // makes a negative num into positive
            num= num* -1;
        }
        if (num ==0) {               // this counts 0 as a digit 1, doesnt skip it
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num= num/10;    // can be also written as num/=10
        }
        return count;
    }

}
