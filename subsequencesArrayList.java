import java.util.ArrayList;

public class subsequencesArrayList {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subseq("", s));
    }

    public static ArrayList<String> subseq(String p, String s) {
        if (s.isEmpty()) {
            ArrayList<String> base = new ArrayList<>();
            base.add(p);
            return base;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subseq(p + ch, s.substring(1));
        ArrayList<String> right = subseq(p, s.substring(1));
        left.addAll(right);
        return left;
    }
}
// errors in this code are in line 16 and 17 and they are 
