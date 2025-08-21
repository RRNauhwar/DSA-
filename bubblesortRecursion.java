import java.util.Arrays;
public class bubblesortRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 4, 5, 9, 5 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr,int rows,int cols) {
        if (rows == arr.length - 1) {
            return;
        }
        if (cols<arr.length-1) {
            if (arr[cols] > arr[cols + 1]) {
                int temp = arr[cols];
                arr[cols] = arr[cols + 1];
                arr[cols + 1] = temp;
            }
            bubbleSort(arr, rows, cols + 1);
        }
        else {
            bubbleSort(arr, rows + 1, 0);
        }
    }
}
