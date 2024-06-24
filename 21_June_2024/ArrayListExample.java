package com.pooja;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(22);
        list.add(5654);
        list.add(54);
        list.add(773);
        list.add(3456);
        list.add(3454);
        System.out.println(list.contains(3454));
        list.set(0, 100);       // update index number 0
        list.remove(2);  //for remove index number two
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get the item of index number
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
