// Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

// Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.
class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int m = (start+end)/2;
            if(arr[m]<=x){
                ans = m;
                start = m+1;
            }
            else{
                end = m-1;
            }
        }
        return ans;
    }
}
