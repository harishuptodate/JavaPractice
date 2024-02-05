public class CountNums {
    public static void main(String[] args) {
        int n = 984803291;
        int count = 0;
        while (n>0){
            int rem = n % 10;             // this gives the reminder, i.e, it gives the last digit which has to be checked
            if ( rem == 8) {
                count++;
            }
        n= n / 10;                       // this gives the quotient, i.e, it reduces the n by 1 digit

        }
        System.out.println(count);

    }
}
