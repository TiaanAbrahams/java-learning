package dev.lpa;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2]= 3.5;

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array length = " + firstTen.length);
        System.out.println("First element = " + firstTen[0]);

        int[] newArray;
        newArray =new int[5];
        //newArray = new int[]{5,4,3,2,1};
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for(int i=0; i < newArray.length; i++){
            System.out.printf("%d ", newArray[i]);;
        }
        System.out.print("\n");
        for(int element: newArray){
            System.out.print(element + " ");
        }
        Object array = newArray;
        System.out.println();
        if(array instanceof int[]){
            System.out.println("Array is a integer array");
        }
        Object [] objectArray = new Object[3];
        objectArray[0] = "String";
        objectArray[1] = new StringBuilder("New String");
        objectArray[2] = 2;

        System.out.println(objectArray[2]);
    }
}
