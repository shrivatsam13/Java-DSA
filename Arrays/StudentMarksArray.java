package Arrays;

import java.util.Scanner;

public class StudentMarksArray {

    public static void main(String[] args) {

        int[] numArray = new int[5];
//        int[] numArray = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter you marks:");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }

        System.out.println("Your marks in different subjects are as follows: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]+" ");
        }

        System.out.println("\nHi "+name+", your average of "+numArray.length+" subjects is: ");
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println(sum/numArray.length);
    }
}
