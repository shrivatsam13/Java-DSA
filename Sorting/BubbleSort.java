package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Sorting array using bubble sort with time complexity O(n^2)\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter "+size+" elements in array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(array);
        int[] ascArray = array;
        int[] dscArray = array;

        //Sorting in asc order
        for (int i = 0; i < size-1 ; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (ascArray[j] > ascArray[j+1]) {
                    int temp = ascArray[j];
                    ascArray[j] = ascArray[j+1];
                    ascArray[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted array in ascending order:");
        printArray(ascArray);

        //Sorting in desc order
        for (int i = 0; i < size-1 ; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (dscArray[j] < dscArray[j+1]) {
                    int temp = dscArray[j];
                    dscArray[j] = dscArray[j+1];
                    dscArray[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted array in descending order:");
        printArray(dscArray);

    }
}
