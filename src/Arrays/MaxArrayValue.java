package Arrays;
public class MaxArrayValue {
    public static void main(String[] args) {
        int [] arr = {11,2,48,69,8,1};
//        System.out.println(maxRange(arr, 0, 2));
//        System.out.println(max(arr));
        System.out.println(def(arr));
    }
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start , int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end ; i++) {
            if( arr[i] > maxVal){
                maxVal = arr[i] ;
            }
        }
        return maxVal;
    }
    // imagine that arr is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if( arr[i] > maxVal){
                maxVal = arr[i] ;
            }
        }
        return maxVal;
    }
    // not for beginners, this is using functions
    static int def(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(min);
        System.out.println(max);
        return max;
    }
}

