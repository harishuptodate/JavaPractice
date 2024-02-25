package Arrays;
import java.util.Arrays;
public class MaxProDifBw2pairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
//    Arrays.sort(nums);
//
//        int n=nums.length;
//        int pro =  (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);   // 42-8=34
//        System.out.println(pro);
        System.out.println(maxProductDifference(nums));
    }

        static int maxProductDifference(int[] nums) {
            int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
            int max = 0, secondMax = 0;
            for (int i : nums) {
                if (i <= min) {
                    secondMin = min;
                    min = i;
                } else if (i < secondMin) {
                    secondMin = i;
                }
                if (max <= i) {
                    secondMax = max;
                    max = i;
                } else if (secondMax < i) {
                    secondMax = i;
                }
            }
            return (max * secondMax) - (min * secondMin);
        }
    }

