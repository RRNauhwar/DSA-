class Solution {
    static int searchInsertK(int Arr[], int N, int k) {
        // code here
        int n = Arr.length;
        if(k>Arr[n-1]){
            return n;
        }
        else if(k<Arr[0]){
            return 0;
        }
        int s = 0;
        int e = n;
        int ans = -1;
        while(s<=e){
            int m = (s+e)/2;
            if(Arr[m]<k){
                s = m+1;
            }
            else if(Arr[m]>=k){
                ans = m;
                e = m-1;
            }
        }
        return ans;
        
    }
}
