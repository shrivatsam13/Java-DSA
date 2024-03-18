package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Insertion sort with time complexity O(n)\n");
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
        for (int i = 1; i < size ; i++) {
            int current  = ascArray[i];
            int j = i-1;
            while ( j >= 0 && current < ascArray[j]) {
                ascArray[j+1] = ascArray[j];
                j--;
            }
            //placement
            ascArray[j+1] = current;
        }

        System.out.println("\nSorted array in ascending order:");
        printArray(ascArray);

        //Sorting in desc order
        for (int i = 1; i < size ; i++) {
            int current  = dscArray[i];
            int j = i-1;
            while ( j >= 0 && current > dscArray[j]) {
                dscArray[j+1] = dscArray[j];
                j--;
            }
            //placement
            dscArray[j+1] = current;
        }

        System.out.println("\nSorted array in descending order:");
        printArray(dscArray);
    }
}
