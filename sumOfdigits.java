//import java.util.Scanner;
public class sumOfdigits {
    public static void main(String[] args) {
        // Scanner input = new Scanner (System.in);
        // System.out.println("Enter the number...");
        // int n = input.nextInt();
        System.out.println(sum(101));

   }
    static int sum(int n){

        if (n>0&&n<=9){
            return n;
        }
        return n%10*sum(n/10);
    }
}
