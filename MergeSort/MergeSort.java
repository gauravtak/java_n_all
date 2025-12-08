package MergeSort;

public class MergeSort {

    // since we are applying a recursive method so we need a base condition
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int x = 0; x < n1; x++) {
            L[x] = arr[left + x];
        }

        for (int y = 0; y < n2; y++) {
            R[y] = arr[mid + y + 1];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];

        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 33, 66, 2, 71 };
        mergeSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
