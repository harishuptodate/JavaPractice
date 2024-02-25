package BinarySearch;
public class BinarySearch {          // this code is for ascending order of an array
    public static void main(String[] args) {
        int[] arr = { -18, -12,-4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};  // worst case array, because the final answer is itself a mid value
            int target= 22;
        System.out.println(bianrysearch(arr, target));
    }
        // return the index
        // return -1 if it doesn't exist
    static int  bianrysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;  // might be possible that (start + end) exceeds the range of int in java
            if (target < arr[mid]) {
                end = mid - 1;    // To search in b/w start and mid // Shifts the end value to mid -1
            } else if (target > arr[mid]) {
                start = mid + 1; // To search in b/w mid and end // Shifts the start value to mid +1

                // if above not found , answer found
                // answer is the mid value itslef
            } else {
                return mid;
            }
        }
        return -1;
    }
}
