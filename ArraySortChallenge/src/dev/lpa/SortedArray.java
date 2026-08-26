package dev.lpa;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    static int[] array;
    public SortedArray(){

    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("Element %d contents %d%n",i,array[i]);
        }
    }
    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] copyArray){
        //int[] copyArray = Arrays.copyOf(array, array.length);
        int temp = 0;

        for(int i = 0; i < copyArray.length; i++){
            for(int j = 0; j < copyArray.length; j++){

                if(copyArray[i] > copyArray[j]){
                    temp = copyArray[j];
                    copyArray[j] = copyArray[i];
                    copyArray[i] = temp;
                }
            }
        }
        return copyArray;
    }


}
