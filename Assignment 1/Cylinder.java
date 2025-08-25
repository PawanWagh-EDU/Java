import java.util.Scanner;
public class Cylinder{
	public  static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. Find Surface area of Circle :");	
	System.out.println("2. Find volume of Cylinder :");

	System.out.println("Enter the Choice : ");
	int choice = sc.nextInt();

	float hgt,r;	
	switch(choice){
	
	case 1 : 
		System.out.println("Enter the Radius :");
		r = sc.nextFloat();
		System.out.println("Enter the Height :");
		hgt = sc.nextFloat();
		System.out.println("The Area of Cylinder is :"+(2*Math.PI*r*r + 2*Math.PI*r*hgt));
		break ; 

	case 2 :
		System.out.println("Enter the Radius :");
		r = sc.nextFloat();
		System.out.println("Enter the Height");
		hgt = sc.nextFloat();
		System.out.println("The Volume of Cylinder is :"+(Math.PI*r*r*hgt));
		break ; 

	default : System.out.println("Invalid Choice");
	
	sc.close();
}
}
}