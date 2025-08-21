public class triangle2 {
    public static void main(String[] args) {
        int count = 5;
        printPattern(count,0);
    }

    static void printPattern(int rows, int cols) {
        if (rows == 0) {
            return;
        }
        if (cols < rows) {
            printPattern(rows, cols + 1);
            System.out.print("* ");
        }
        else {
            printPattern(rows-1, 0);
            System.out.println();
        }
    }
}
