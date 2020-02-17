package com.tothenew.bootcamp.corejava;

public class Arrays {

    public static void main(String[] args) {
        /*int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        int[][] multiDimentionalArray = new int[5][5];
        for (int i = 0; i < multiDimentionalArray.length; i++) {
            for (int j = 0; j < multiDimentionalArray[i].length; j++) {
                System.out.print(multiDimentionalArray[i][j] + "\t");
            }
            System.out.println();
        }
        String s = "Hello";

    }
}
