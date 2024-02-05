package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums ={10,11,12,13,14,15,16};
        int target = 12;
        System.out.println(linearSearch2(nums,target,1,4));
    }
    static int linearSearch2(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -2;          // this is because the array index never be a -1 or any negative value
        }
        // run a for loop
        for (int index = start; index <=end; index++) {
            // check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
