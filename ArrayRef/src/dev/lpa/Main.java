package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int readInt = MinimumElement.readInteger();

        int[] array = MinimumElement.readElements(readInt);

        System.out.println(MinimumElement.findMin(array));

    }

}
