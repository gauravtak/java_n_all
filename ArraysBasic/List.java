package ArraysBasic;

import java.util.ArrayList;

public class List {

    public static void printInRange(ArrayList<Integer> list, int begin, int end) {
        for (int num : list) {
            if (num >= begin && num <= end) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(-5);
        list.add(10);
        list.add(11);
        list.add(-4);
        list.add(12);
        list.add(2);
        list.add(12);

        printInRange(list, -4, 10);
    }
}
