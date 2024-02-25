package Arrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(Solution(nums)));

    }
     static int[] Solution(int[] nums) {
            for (int i=1; i<nums.length; i++) {
                nums[i] =nums[i] + nums[i-1];
            }
            return nums ;
        }
    }

