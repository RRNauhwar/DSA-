public class PrintNumbers {

    // Recursive method to print numbers from 1 to n
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1); // Recursive call with n-1
            System.out.println(n); // Print the current number
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to print numbers up to n
        printNumbers(n); // Call the recursive method
    }
}
