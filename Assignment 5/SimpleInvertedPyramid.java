public class SimpleInvertedPyramid{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
     
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                if (i == 0 || j == 0 || j == 2 * (rows - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
