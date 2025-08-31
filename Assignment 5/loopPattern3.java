public class loopPattern3{
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == 2) {
                System.out.println("**");
            } else if (i == 3) {
                System.out.print("*");
                for (int j = 0; j < 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else if (i == 4 || i == 5) {
                System.out.println("*");
            } else if (i == 6) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
