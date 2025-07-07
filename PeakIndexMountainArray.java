class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length-1;
        if((n==1)||(arr[0]>arr[1])){
            return 0;
        }
        else if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        else {
            int s = 1;
            int e = n-2;
            while(s<=e){
                int m = s+(e-s)/2;
                if((arr[m-1]<arr[m])&&(arr[m]>arr[m+1])){
                    return m;
                }
                else if(arr[m-1]<arr[m]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
        }
        return -1;
    }
}
