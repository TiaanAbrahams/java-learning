package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Milk", "Eggs"};
        System.out.println(Arrays.toString(items));


        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> arrayList = new ArrayList<>(list);

        arrayList.add("Yogurt");
        System.out.println(arrayList);

        arrayList.removeAll(List.of("Apples","Eggs"));
        System.out.println(arrayList);

        int[] sArray = new int[]{1,2};
        int[] sArray2 = {1, 2, 3};
        Integer[] sArray3 = new Integer[]{3,4};



    }
}
