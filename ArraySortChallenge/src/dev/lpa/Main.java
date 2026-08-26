package dev.lpa;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int[] array = SortedArray.getIntegers(3);
        SortedArray.printArray(array);
        ;
        SortedArray.sortIntegers(array);
    }
}

