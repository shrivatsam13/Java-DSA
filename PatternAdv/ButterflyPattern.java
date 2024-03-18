package PatternAdv;

public class ButterflyPattern {

    public static void main(String[] args) {
        int row = 8;

        for (int i = 1; i <= row/2 ; i++) {
            for (int j = 1; j <= row ; j++) {
                if ( j <= i || j > row-i ) {
                    System.out.print("* ");
                }  else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = row/2+1; i <= row ; i++) {
            for (int j = 1; j <= row ; j++) {
                if ( j<=row-i+1 || j>=i) {
                    System.out.print("* ");
                }  else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
