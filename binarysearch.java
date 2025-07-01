class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int m = (start+end)/2;
            if(arr[m]<k){
                start = m+1;
            }
            else if(arr[m]==k){
                ans = m;
                end = m-1;
            }
            else{
                end = m-1;
            }
        }
        return ans;
    }
}
