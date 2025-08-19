public class triangle1 {
    public static void main(String[] args) {
        int count = 5;
        pattern(count);
    }

    static void pattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1);
    }
}
