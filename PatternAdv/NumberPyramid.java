package PatternAdv;

public class NumberPyramid {

    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row ; i++) {
//            for (int j = 1; j < row*2 ; j++) {
//                if ( j > row-i+1 && j < row+i+1 ){
//                    System.out.print(i+" ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
            for (int j = row-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i  ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
