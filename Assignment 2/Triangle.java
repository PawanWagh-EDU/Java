import java.util.Scanner;
	
public class Triangle{
	public static void main(String[] args){

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Side's of Triangle");

	System.out.println("Enter the First Side :");
	float a = nextFloat();
	System.out.println("Enter the Second Side :");
	float b = nextFloat();
	System.out.println("Enter the Third Side :");
	float c = nextFloat();
	
	if(a > b || a > c || b > c || b > a || c > a || c > b){
		System.println("The Valid triangle");
	}else{
		System.out.println("Not valid triangle");
	}
	sc.close();
	}
}