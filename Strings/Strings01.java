package Strings;

import java.util.Scanner;

public class Strings01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //compareTo() and charAt()
        System.out.println("Enter your name: ");
        String name1 = sc.nextLine();
        System.out.println("Length of name "+name1+" is: "+name1.length());

        String name2 = "Shrivats";
        System.out.println(name1.compareTo(name2));
        for (int i = 0; i < name1.length(); i++) {
            System.out.print(name1.charAt(i)+ " ");
        }


//        Replacing a character in string
        System.out.println("\nEnter a string to replace char 'e' with 'i':");
        String string1 = sc.nextLine();
        String result = "";
        result = string1.replace("e", "i");
        System.out.println("New string: "+result);

//        create username from email
        System.out.println("Enter you email to generate username:");
        String email = sc.nextLine();
        String userName = "";
        userName = email.replace("@gmail.com", "");
        System.out.println("User name for "+email+" will be "+userName);

    }
}
