class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> result = new ArrayList <>();
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else i++;
        }
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                result.add(nums[index]);
            }
        }
        return result;
    }
}
