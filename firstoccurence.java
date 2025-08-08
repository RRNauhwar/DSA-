public class firstoccurence {
    public static void main(String[] args) {
        int [] arr = {1,8,4,2,5,2,4,4,2,15,7};
        System.out.println(firstIndex(arr, 0, 2));
    }
    public static int firstIndex(int []arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            return firstIndex(arr, idx+1, x);
        }
    }
}
