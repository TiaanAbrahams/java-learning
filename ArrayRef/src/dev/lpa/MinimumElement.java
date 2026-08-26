package dev.lpa;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int numberOFElements){
        int[] array = new int[numberOFElements];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];

        for(int i: array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}
