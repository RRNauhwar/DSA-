public class noofZeroes {
    static int zeroes = 0;
    static void noOfzeroes(int n){
        if (n==0) {
            return;
        } 
        int a = n%10;
        if(a==0){
        zeroes = zeroes+1;}
        n=n/10;
        noOfzeroes(n);
        
    }
    public static void main(String[] args) {
        noOfzeroes(300003);
        System.out.println(zeroes);
    }
}
