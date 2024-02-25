package ConditionalLoops;

public class ReverseSeries {
    public static void main(String[] args) {
        int n = 984803290;
        int Rev = 0;
        while ( n >0){
            int remin = n  % 10;
             n = n /10;
             Rev = Rev *10  + remin;
        }

        System.out.println(Rev);
    }
}
