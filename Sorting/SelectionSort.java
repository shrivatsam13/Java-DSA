package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Selection sort with time complexity O(n^2)\n");
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
            int smallest = i;
            for (int j = i+1; j < size; j++) {
                if (ascArray[j] < ascArray[smallest] ) {
                    smallest = j;
                }
            }
            int temp = ascArray[i];
            ascArray[i] = ascArray[smallest];
            ascArray[smallest] = temp;
        }

        System.out.println("\nSorted array in ascending order:");
        printArray(ascArray);

        //Sorting in desc order
        for (int i = 0; i < size-1 ; i++) {
            int largest = i;
            for (int j = i+1; j < size; j++) {
                if (dscArray[j] > dscArray[largest] ) {
                    largest = j;
                }
            }
            int temp = dscArray[i];
            dscArray[i] = dscArray[largest];
            dscArray[largest] = temp;
        }

        System.out.println("\nSorted array in descending order:");
        printArray(dscArray);
    }
}
