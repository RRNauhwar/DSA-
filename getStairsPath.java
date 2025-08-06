import java.util.ArrayList;

public class getStairsPath {
    public static void main(String[] args) {
        System.out.println(getSP(3));
    }
    public static ArrayList <String> getSP(int num){
        if(num==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        else if(num<0){
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }
        ArrayList <String> path1 = getSP(num-1);
        ArrayList <String> path2 = getSP(num-2);
        ArrayList <String> path3 = getSP(num-3);
        ArrayList <String> paths = new ArrayList <>();
        for(String path:path1){
            paths.add(1+path);
        }
        for(String path:path2){
            paths.add(2+path);
        }
        for(String path:path3){
            paths.add(3+path);
        }
        return paths;
    }
}
