package BinarySearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class FirstAndLastPosition {          // this code is for ascending order of an array
    public static void main(String[] args) {
        int[] arr = { 5,7,7,8,8,8,10};
            int target= 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
        // return the index
        // return -1 if it doesn't exist
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for the first occurrence of target first
        ans[0] =   FnLindex(nums, target, true);
        if(ans[0]!=-1) { // if it is -1 , no need to check the ans[1] value because it doesnt exist according to question //
            ans[1] = FnLindex(nums, target, false);
        }
        return ans;
    }
    // this function just returns the index value of target

    static int FnLindex(int[] nums, int target, boolean firstIndex) {  // this is binarysearch
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;  // might be possible that (start + end) exceeds the range of int in java
            if (target < nums[mid]) {
                end = mid - 1;    // To search in b/w start and mid // Shifts the end value to mid -1
            } else if (target > nums[mid]) {
                start = mid + 1; // To search in b/w mid and end // Shifts the start value to mid +1
                // if above not found , answer found
                // answer is the mid value itslef
            } else {
                // potential ans found
                ans = mid;

                if (firstIndex) { // if true
                    end = mid - 1;
                } else {   // if false
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
