package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 9, 14, 16, 18};  // should return 16
        int target = 1;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    // floor: greatest element which is less than or equal (<=) to target,
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1 ;
            }else {
                return mid;
            }
        }
        return end; // return arr[end]; for the element value
    }
}
