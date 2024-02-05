package LinearSearch;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, -9, 10, 11, -12, 13};
        int target = 10;
        boolean ans = linearSearch1(nums, target); // same code, just changed the return type
        int ans1 = linearSearch2(nums, target);   // returns index
        int ans2 = linearSearch3(nums, target);   // returns element
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    // search the target and returns true or false
    static boolean linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return false;          // this is because the array index never be a  -1 or any negative value
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -2;          // this is because the array index never be a -1 or any negative value
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }



    // search the target and return the element
    static int linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -2;          // this is because the array index never be a -1 or any negative value
        }
        // run an enh for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}