public class triangle1 {
    public static void main(String[] args) {
        int count = 5;
        printPattern(count,0);
    }

    static void printPattern(int rows, int cols) {
        if (rows == 0) {
            return;
        }
        if (cols < rows) {
            System.out.print("* ");
            printPattern(rows, cols + 1);
        }
        else {
            System.out.println();
            printPattern(rows-1, 0);
        }
    }
}
