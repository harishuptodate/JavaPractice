package LinearSearch;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class BuySellStocksLeetcode {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans=stocks(arr);
        System.out.println();

    }
    static  int stocks(int[] prices){
    int maxi = 0;
    int minimum = prices[0];
for (int i=0; i< prices.length; i++ ){
        minimum = min(minimum ,prices[i]);
        maxi = max(maxi ,prices[i]  )- minimum;
    }
return maxi;
}
}
