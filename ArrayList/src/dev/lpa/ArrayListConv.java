package dev.lpa;

import java.util.Arrays;
import java.util.List;

public class ArrayListConv {
    public static void main(String[] args) {
        String[] originalArray = {"First", "Second", "Third"};

        var originalList = Arrays.asList(originalArray);

        System.out.println(originalList);
        originalList.set(0, "One");
        System.out.println("OriginalList =  " + originalList);
        System.out.println("OriginalArray =  " + Arrays.toString(originalArray));


    }
}
