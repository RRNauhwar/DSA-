public class skipString{
    public static void main(String[] args) {
        String str = "RahulChaudharyNauhwar";
        System.out.println(skipString(str));

    }

    public static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("Chaudhary")) {
            return skipString(str.substring("Chaudhary".length()));
        }
        else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}