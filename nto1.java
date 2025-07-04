public class nto1 {
    public static void main(String[] args) {
        solution(10);
    }
    static void solution(int n){
        if (n==0)
        return;
        System.out.println(n);
        solution(n-1);
    }
}
