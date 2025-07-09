// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList <Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b)->{int freqCompare = map.get(b) - map.get(a);
    if (freqCompare != 0) return freqCompare;
    return b - a;});
        ArrayList <Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(keys.get(i));
        }
        return res;
    }
}

