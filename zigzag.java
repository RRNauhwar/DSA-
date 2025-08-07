public class zigzag {
    public static void main(String[] args) {
        printzigzag(2);
    }
    public static void printzigzag(int n){
        if(n==0){
            return;
        }
        System.out.println("pre"+n);
        printzigzag(n-1);
        System.out.println("In"+n);
        printzigzag(n-1);
        System.out.println("Post"+n);
    }
}
