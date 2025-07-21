class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int pivot = findPivot(arr);
        return pivot+1;
        
    }
    public int findPivot(List <Integer> arr){
        int start = 0;
        int end = arr.size()-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid<end&&arr.get(mid)>arr.get(mid+1)){
                return mid;
            }
            if(start<mid&&arr.get(mid-1)>arr.get(mid)){
                return mid-1;
            }
            if(arr.get(start)>arr.get(mid)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
