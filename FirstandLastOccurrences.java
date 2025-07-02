class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList <Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        boolean isFirstIndex = true;
        ans.set(0,Searching(arr,x,isFirstIndex));
        if(ans.get(0)!=-1){
            isFirstIndex = false;
        }
        ans.set(1,Searching(arr,x,isFirstIndex));
        return ans;
    }
    public int Searching(int[] arr,int target,boolean isFirstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int m = (start+end)/2;
            if(arr[m]<target){
                start = m+1;
            }
            else if(arr[m]>target){
                end = m-1;
            }
            else{
                ans = m;
                if(isFirstIndex){
                    end = m-1;
                }
                else{
                    start = m+1;
                }
            }
        }
        return ans;
    }
}
