public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,5));
    }
    static int search(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle =start + (end-start)/2;
            if(target==arr[middle]){
                return middle;
            }
            else if (target<arr[middle]){
                end = middle-1;
            }
            else{
                start = middle+1;
            }
        }
        return -1;
    }
}
