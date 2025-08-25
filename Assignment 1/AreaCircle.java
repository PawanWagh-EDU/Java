import java.util.Scanner;

public class AreaCircle{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Choice :");

	float r;

	System.out.println("1. Area of Circle");
	System.out.println("2. Area of Curcumference of Circle");
	
	int Choice = sc.nextInt();

	switch(Choice){

	case 1 :System.out.println("Enter Radius");
		r = sc.nextFloat();
		System.out.println("The Area of Circle is :"+(Math.PI*r*r));
		break;

	case 2 :System.out.println("Enter Radius");
		r = sc.nextFloat(); 
		System.out.println("The Area of Curcumference of Circle is :"+(2*Math.PI*r));
		break;

	default : System.out.println("Invalid Input");

	sc.close();

		}	
	}
}