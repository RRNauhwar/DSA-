public class ceilInsortedarrayRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 11, 12, 19 };
        int target = 5;
        int ans = -1;
        ans = ceil(arr, 0, arr.length - 1, target, ans);
        System.out.println(ans);

    }

    static int ceil(int[] arr, int s, int e, int target, int ans) {
        int m = s + (e - s) / 2;
        if (s > e) {
            return ans;
        }
        if (arr[m] >= target) {
            ans = m;
            return ceil(arr, s, m - 1, target,ans);
        }
        else {
            return ceil(arr, m + 1, e, target, ans);
        }
    }
    
}
