import java.util.ArrayList;

public class getMazePaths {
    public static void main(String[] args) {
        System.out.println(getMazePaths(1, 1, 3, 3));
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }

        return paths;
    }
}