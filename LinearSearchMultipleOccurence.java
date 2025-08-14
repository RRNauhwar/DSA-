// linear search using recursion for multiple occurences
import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearchMultipleOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 3, 2, 5, 3, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        findOccurences(arr, 3, 0, list);
        System.out.println(list);
    }

    static ArrayList findOccurences(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findOccurences(arr, target, index + 1, list);
    }
}
