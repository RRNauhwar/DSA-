import java.util.Scanner;
public class inverseNum {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input an integer.");
        int number = input.nextInt();
        int count = 0;
        int result = 0;
        while (number!=0){
            int a = number%10;
            count++;
            result += count * (int)Math.pow(10, a - 1);
            number = number/10;
        }
        System.out.println(result);
    }
    
}