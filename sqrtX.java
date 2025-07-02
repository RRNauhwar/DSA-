class Solution {
    int floorSqrt(int n) {
        // code here
        int s = 0;
        int e = n;
        int ans = 1;
        while(s<=e){
            int m = (s+e)/2;
            int val = m*m;
            if(val==n){
                return m;
            }
            else if(val<n){
                ans = m;
                s =m+1;
            }
            else{
                e = m-1;
            }
        }
        return ans;
    }
}
