public class order_agostic_binarysearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
        int taget = 5;
        int ans = BinarySearch(arr, taget);
        int ans2 = BinarySearch(arr2, taget);
        System.out.println("ans1 = "+ans+" ans2 = "+ans2);


    }
    public static int BinarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        boolean isAsc = false;
        if(arr[0]<arr[1]) isAsc = true;
        while (start<=end) {
            int m = (start+end)/2;
            if(arr[m]==target){
                ans = m;
                if(isAsc) end = m-1;
                else start = m+1;
            }
            if(isAsc){
                if(arr[m]<target){
                    start = m+1;
                }
                else{
                    end = m-1;
                }
            }
            else{
                if(arr[m]<target){
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
