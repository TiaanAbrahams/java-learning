package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] rArray = getRandomArray(10);

        System.out.println(Arrays.toString(rArray));
        Arrays.sort(rArray);
        System.out.println(Arrays.toString(rArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        System.out.println();

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] copyArray = Arrays.copyOf(thirdArray, thirdArray.length);
        Arrays.sort(thirdArray);

        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(copyArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);

        if(Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Mark has been found");
        }

    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
