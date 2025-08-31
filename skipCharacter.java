public class skipCharacter {
    public static void main(String[] args) {
        String s = "rahul chaudhary";
        System.out.println(skip(s));
    }

    public static String skip(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            return skip(s.substring(1));
        }
        else {
            return ch+skip(s.substring(1));
        }
    }
}
