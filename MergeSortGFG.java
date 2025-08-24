class Solution {

    void mergeSort(int arr[], int l, int r) {
        if (l >= r) {   // base case: only 1 element
            return;
        }
        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] mix = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= m) {
            mix[k++] = arr[i++];
        }

        while (j <= r) {
            mix[k++] = arr[j++];
        }

        for (int x = 0; x < mix.length; x++) {
            arr[l + x] = mix[x];
        }
    }
}
