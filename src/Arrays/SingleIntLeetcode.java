package Arrays;

public class SingleIntLeetcode {    // LC problem no 136
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber( nums));
    }
    static int singleNumber(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {

            count = count^nums[i];
            }
        return count;

    }
}
