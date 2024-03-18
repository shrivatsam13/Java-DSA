package Arrays;

import java.util.Scanner;

public class Arrays2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] numArray = new int[rows][columns];

        System.out.println("Enter "+rows*columns+" elements to be inserted in array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here's your 2d array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
