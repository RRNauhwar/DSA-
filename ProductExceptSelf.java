// Given an array of integers, the goal is to create a new array where each element at index i is the product of all numbers in the original array except the number at index i. A key constraint is to avoid using the division operator.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i = 1;i<n;i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i] = nums[i+1]*suffix[i+1];
        }
        for(int i=0;i<n;i++){
            res[i] = prefix[i]*suffix[i];
        }
        return res;
    }
}
