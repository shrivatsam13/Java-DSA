package Pattern;

public class InvertedHalfPyramidRotatedBy180 {

    public static void main(String[] args) {
        int row = 4;

        for (int i = row; i >= 1 ; i--) {
            for (int j = 1; j <= row ; j++) {
                if ( j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
