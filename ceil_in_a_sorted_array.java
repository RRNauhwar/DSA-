// Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x. This element is called the ceil of x. If such an element does not exist, return -1.

// Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int m = (start+end)/2;
            if(arr[m]<x){
                start = m+1;
            }
            else if(arr[m]>x||arr[m]==x){
                ans = m;
                end = m-1;
            }
        }
        return ans;
    }
}

