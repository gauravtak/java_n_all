package ArraysBasic;

import java.util.Arrays;

class CreateArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 5, 6 };

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }

        System.out.println(Arrays.toString(args));

    }
}