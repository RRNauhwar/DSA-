// Given an integer array nums and an integer k, return the kth largest element in the array.
class Solution {
    public int findKthLargest(int[] nums, int k) {
        HashMap <Integer,Integer> hash = new HashMap<>();
        for (int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        List <Integer> keys = new ArrayList<>(hash.keySet());
        keys.sort(Collections.reverseOrder());
        for (int num:keys){
            k-=hash.get(num);
            if(k<=0){
            return num;
        }
        }
        return -1;
    }
}
