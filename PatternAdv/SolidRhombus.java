package PatternAdv;

public class SolidRhombus {

    public static void main(String[] args) {
        int row = 5;

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < 10; j++) {
                if ( j >= row-i && j < row*2-i ) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
