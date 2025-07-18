class Solution {
    public static boolean Search(int[] arr, int k) {
        // code here
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int m = (start+end)/2;
            if(arr[m]==k){
                return true;
            }
            if(arr[start]==arr[m]&&arr[end]==arr[m]){
                start += 1;
                end -= 1;
                continue;
            }
            // check if first half is sorted
            if(arr[start]<=arr[m]){
                if(arr[start]<=k&&arr[m]>k){
                    end = m-1;
                }
                else{
                    start = m+1;
                }
            }
              // check is second half is sorted
            else{
                if(arr[m]<k&&arr[end]>=k){
                    start = m+1;
                }
                else{
                    end = m-1;
                }
            }
        }
        return false;
    }
}
