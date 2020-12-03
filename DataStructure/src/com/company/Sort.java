package com.company;

public class Sort {

    public static int[] sort(int[] array) {
        int[] finalArray = new int[array.length];
        finalArray[0] = 0;
        for (int i:finalArray) {
            System.out.println("array" + i);
        }
        for (int i = 0; i<array.length; i++){
            if (finalArray[i] == -55){
                finalArray[0] = array[0];
                i++;
            } else if (array[i] < finalArray[i]){
                int j = finalArray[1];
                finalArray[1] = array[i];
                finalArray[i] = j;
            } else if (array[i] > finalArray[i]){
                finalArray[i] = array[i];
            }
        }
        for (int i:finalArray) {
            System.out.println("final" + i);
        }
        return finalArray;
    }
}
