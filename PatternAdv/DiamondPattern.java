package PatternAdv;

public class DiamondPattern {

    public static void main(String[] args) {
        int row = 4;

        for (int i = 1; i <= row ; i++) {
            for (int j = row; j >= i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i >= 1 ; i--) {
            for (int j = 1; j <= row-i+1  ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print("* ");
            }
            for (int j = i; j >= 2 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
