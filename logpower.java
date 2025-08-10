public class logpower {
    public static void main(String[] args) {
        System.out.println(logpower(4,2));
    }
    public static int logpower(int n,int p){
        if(p==0){
            return 1;
        }
        int halfpower = logpower(n,p/2);
        if(p%2==0){
            return halfpower*halfpower;
        }
        else {
            return n*halfpower*halfpower;
        }
    }
}
