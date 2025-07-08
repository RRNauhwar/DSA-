// Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the kth smallest element in the given array.
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int [] hash = new int [1000001];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]] += 1;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
            k--;}
            if(k==0){
            return i;
        }
        }
        return -1;
    }
}
