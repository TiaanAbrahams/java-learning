package dev.dpl;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = randomArray(5);
        System.out.print(Arrays.toString(arrayReverse(array)));
    }

    public static int[] randomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];

        for(int i = 0; i < len; i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;

    }

    public static int[] arrayReverse(int[] array){
        int high = 0;
        int temp = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[array.length - 1 - i]) {
                    temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                    System.out.printf("Array1 %d | Array2 %d | Temp %d %n", array[i], array[array.length - 1 - i], temp);
                }
            }
        return array;
    }
}
