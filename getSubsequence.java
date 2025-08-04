import java.util.ArrayList;
public class getSubsequence {
public static void main(String[] args) {
    System.out.println(gss("gf"));
}
    public static ArrayList<String> gss (String str){
        if(str.length()==0){
            ArrayList <String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String sstr = str.substring(1);
        ArrayList<String> rres = gss(sstr);
        ArrayList <String> result = new ArrayList<>();
        for(String strr:rres){
            result.add(""+strr);
            result.add(ch+strr);
        }
        return result;
    }
}