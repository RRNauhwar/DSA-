public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 8, 11, 16, 19 };
        int target = 8;
        System.err.println(binarySearch(arr, 0, arr.length-1, target));
    }

    static int binarySearch(int[] arr,int s,int e,int target) {
        int m = (e + s) / 2;
        if (s > e) {
            return -1;
        }
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] < target) {
            return binarySearch(arr, m + 1, e, target);
        }
        else {
            return binarySearch(arr, s, m - 1, target);
        }
        }
        
}
