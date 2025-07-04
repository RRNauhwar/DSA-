public class reversenumber {
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int a = n%10;
        sum = sum*10+a;
        n = n/10;
        reverse(n);
    }
    public static void main(String[] args) {
        reverse(1000);
        System.out.println(sum);
    }
}
