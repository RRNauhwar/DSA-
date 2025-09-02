public class subsequences {
    public static void main(String[] args) {
        String str = "abc";
        subseq("", str);
    }

    public static void subseq(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        subseq(p+ch, str.substring(1));
        subseq(p, str.substring(1));
    }
}
