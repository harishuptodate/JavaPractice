public class Count {
    public static void main(String[] args) {
        int in = 5555565; //6
        int count = 0;
        while ( in > 0 ) {
            int remin= in % 10;
            if ( remin == 5) {
                count++;
            }
            in/=10;

        }
        System.out.println(count);
    }

}
