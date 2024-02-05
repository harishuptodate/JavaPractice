package LinearSearch;

public class FindMinLeetcode {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, -7, 14, 15, 16};
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
