package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 9, 14, 16, 18};  // should return 16
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    // ceiling: smallest element which is greater than equal (>=) to target,
    static int ceiling(int[] arr, int target){
        // if ceiling question  // what if the target is greater than the greatest number in the array, then
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            // find the mid element
            int mid = start + (end - start) / 2;  // might be possible that (start + end) exceeds the range of int in java
            if (target < arr[mid]) {
                end = mid - 1;    // To search in b/w start and mid // Shifts the end value to mid -1
            } else if (target > arr[mid]) {
                start = mid + 1; // To search in b/w mid and end // Shifts the start value to mid +1

                // if above not found , answer found
                // answer is the mid value itslef
            }else {
                return mid;
            }
        }
        return start; // return arr[start]; for element value
    }
}
