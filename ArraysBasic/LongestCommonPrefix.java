package ArraysBasic;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flat", "flower", "flex" };
        Arrays.sort(strs);
        String result = "";
        String a = strs[0];
        String b = strs[strs.length - 1];

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result += a.charAt(i);
            } else {
                break;
            }
        }

        System.out.println(result);

    }
}
