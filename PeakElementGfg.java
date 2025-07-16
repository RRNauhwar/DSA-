// question link -  https://www.geeksforgeeks.org/problems/peak-element/1
class Solution {

    public int peakElement(int[] arr) {
        // code here
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int m = (start+end)/2;
            if(arr[m]<arr[m+1]){
                start = m+1;
            }
            else{
                end = m;
            }
        }
        return start;
    }
}
