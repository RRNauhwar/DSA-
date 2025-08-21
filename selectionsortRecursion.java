import java.util.Arrays;
public class selectionsortRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 8, 2, 1, 4, 6, 9 };
        selectionSort(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int []arr,int rows,int cols){
        if (rows == arr.length - 1) {
            return;
        }
        int minIndex = rows;
        if(cols<arr.length){
            if(arr[minIndex]>arr[cols]){
                minIndex = cols;
            }
            selectionSort(arr, rows, cols+1);
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[rows];
        arr[rows] = temp;
        rows = rows + 1;
        selectionSort(arr, rows,rows+1);
    }
}
