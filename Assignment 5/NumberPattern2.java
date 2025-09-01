public class NumberPattern2{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > 5 - i)
                    System.out.print(j);
                else
                    System.out.print(6 - i);
            }
            System.out.println();
        }
    }
}
