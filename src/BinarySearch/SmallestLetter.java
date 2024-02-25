package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};  //
        char target = 'j';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters,char target) { // this is binary search
        int start = 0;
        int end = letters.length-1;
        while (start <= end){
            // find the mid element
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;    // To search in b/w start and mid // Shifts the end value to mid -1
            } else {
                start = mid + 1; // To search in b/w mid and end // Shifts the start value to mid +1

            }
        }
        return letters[start%letters.length];
    }
}
