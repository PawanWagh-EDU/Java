import java.util.Scanner;
	
public class Coordinate{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);	
		
	double x1 , x2 , y1 , y2 , distance;
	System.out.println("Enter the X1 Co-ordinate");
	x1 = nextDouble();	
	
	System.out.println("Enter the Y1 Co-ordinate");
	y1 = nextDouble();

	System.out.println("Enter the X2 Co-ordinate");
	x2 = nextDouble();

	System.out.println("Enter the Y2 Co-ordinate");
	y2 = nextDouble();
	
	distance  = Math.squrt(Math.pow(x2 - x1),2) + Math.pow((y2 - y1),2));
	
	System.out.println("Distance between the two points = "+ distance);
	
	sc.close();
	}
}