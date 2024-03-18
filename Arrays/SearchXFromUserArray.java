package Arrays;

import java.util.Scanner;

public class SearchXFromUserArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] numArray = new int[size];

//        Storing array
        System.out.println("Enter the numbers to be stored in the array: ");
        for (int i = 0; i < size; i++) {
            numArray[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search:");
        int num = sc.nextInt();
        int position = -1 ;

        for (int i = 0; i < size; i++) {
            if (numArray[i] == num) {
                position = i;
                break;
            }
        }

        if (position < 0) {
            System.out.println("'"+num+"' was not found in the array");
        } else {
            System.out.println("'"+num+"' was found on index "+position);

        }

    }
}
