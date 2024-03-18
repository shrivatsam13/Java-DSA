package Pattern;

public class HollowRectangle {

    public static void main(String[] args) {
        int row = 4;
        int column = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row-1 || j == 0 || j == column-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
