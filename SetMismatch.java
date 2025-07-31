class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result = new int [2];
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                result[0] = nums[index];
                result[1] = index+1;
            }
        }
        return result;
    }
}
