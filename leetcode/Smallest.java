package leetcode;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 10, 1, 12, -99 };

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
}