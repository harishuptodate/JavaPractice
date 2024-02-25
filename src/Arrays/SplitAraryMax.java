package Arrays;
//https:leetcode.com/problems/split-array-largest-sum/description/
public class SplitAraryMax {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(Max(nums,m));
    }
    static int Max(int[] nums, int m){
        int start = 0;
        int end  = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i] ); //  scans the entire array,and gives the max value in the array,
            end = end + nums[i]; // this gives the sum of the elements in the array
        }
        // now binary search
        while (start < end){
            // try for the mid as the potential ans
            int mid = start + ( end - start)/2;
            // calcualte how many pieces you can divide this in with in this max sum
            int sum = 0;  // this is the subarray sum
            int pieces = 1;
            for (int num: nums) {
                if( sum + num > mid){
                    // you cannot add this in this subarray, so make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum = sum + num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return start; // or end, coz start == end in the end
    }
}
