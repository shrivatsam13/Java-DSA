package Arrays;

import java.util.Scanner;

public class SearchXIn2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows  = sc.nextInt();

        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        int[][] numArray = new int[rows][columns];

        System.out.println("Enter "+rows*columns+" digits that are to be inserted in array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number that you want to search: ");
        int num = sc.nextInt();

        String position = "";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numArray[i][j] == num) {
                    position += "("+i+", "+j+")";
                    break;
                }
            }
        }

        if (position.equals("")) {
            System.out.println("Number not found");
        } else {
            System.out.println("Digit '"+num+"' found on index "+position);

        }
    }
}
