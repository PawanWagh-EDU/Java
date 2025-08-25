import java.util.Scanner;

    public class AreaOfCircle{
        public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            float r;
            System.out.println("Enter the Radius :");
            r = sc.nextFloat();

            System.out.println("The Circumference of Circle is :"+(2*Math.PI*r));

            sc.Close();
        }

    }