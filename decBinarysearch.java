public class decBinarysearch {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1,0};
        System.out.println(search(arr,3));

    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target==arr[middle]){
                return middle;
            }
            else if(target>arr[middle]){
                end = middle-1;
            }
            else{
                start = middle+1;
            }
        }
        return -1;
    }
}
