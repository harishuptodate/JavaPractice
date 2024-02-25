package BinarySearch;

public class PositionofanElementinInfiniteSortedArrayLeetcode {
    public static void main(String[] args) {

        int[] arr= {3,5,7,9,10,100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    // to search where
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box size of 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while (target>=arr[end]){
            int NewStart = end + 1; // NewStart, this is my NewStart to move the search further
            //  NOWW!! double the box value
            //end = previous end + sizeofbox*2
            end = end + ( end - start + 1) * 2; // ( end - start + 1) is the size of the box
            start = NewStart; // updating the start with the newstart
        }
        return search(arr,target,start, end);
    }
    static int  search(int[] arr, int target, int start, int end){
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
