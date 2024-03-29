package Recursion;

import java.util.Scanner;

public class Recursion01 {

    static int factorial = 1;
    static int sum = 0;
    static int num;
    static int[] array;

    public static void fibonacciSeries(int a, int b, int n) {
        if (n > 1) {
            fibonacciSeries(b, a+b, n-1);
        }
        array[n-1] = a;
//        array[n-1] = a+b;
    }

    public static int factorial(int n) {
        if (n > 1) {
            factorial(n-1);
        }
        factorial = factorial*n;
        return factorial;
    }

    public static int sumOfNNumbers(int n) {
        if ( n > 1) {
            sumOfNNumbers(n-1);
        }
        sum += n;
        return sum;
    }

    public static void main(String[] args) {
        //A function that calls itself is recursion.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        array = new int[num];

        System.out.println("Factorial of '"+num+"' is: "+factorial(num));

        System.out.println("\nSum of first '"+num+"' natural numbers is: "+sumOfNNumbers(num));

        fibonacciSeries(0, 1, num);
        System.out.print("\nFibonacci series of '"+num+"' numbers is: ");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }

}
