package Strings;

public class StringBuilders {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Shrivats");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 's');
        System.out.println(sb);
    }
}
