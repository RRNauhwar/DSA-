class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char ans = '0';
        if(letters[end]<=target){
            return letters[start];
        }
        while(start<=end){
            int m = (start+end)/2;
            if(letters[m]<=target){
                start = m+1;
            }
            else if(letters[m]>target){
                ans = letters[m];
                end = m-1;
            }
        }
        return ans;
    }
}
