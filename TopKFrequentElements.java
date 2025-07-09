// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList <Integer> keys = new ArrayList<>(map.keySet());
        int [] res = new int [k];
        keys.sort((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            res[i] = keys.get(i);
        }
        return res;

    }
}
