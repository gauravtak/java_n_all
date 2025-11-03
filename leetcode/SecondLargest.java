package leetcode;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 10, 2, 80, -10 };

        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        System.out.println(secondLargest);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.print(secondLargest);
    }
}
