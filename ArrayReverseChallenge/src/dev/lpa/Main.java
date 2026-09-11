package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        System.out.println(Arrays.toString(array));
        System.out.println("Array length = " + array.length);

        for(int[] a: array){
            System.out.println(Arrays.toString(a));
        }
        /**
        for(int i = 0; i < array.length; i++){
            for(int j =0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
         **/
/**
        for(var i:  array){
            for(var b: i){
                System.out.print(b);
            }
            System.out.println();
        }
 **/
    System.out.println(Arrays.deepToString(array));

    String s = "Hello there";

        System.out.println(s.getClass().getSimpleName());
    }

}
