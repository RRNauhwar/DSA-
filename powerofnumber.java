public class powerofnumber {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }
    static int solution(int n, int p){
        if (p==0){
            return 1;
        }
        return n*solution(n,p-1);
    }
}

