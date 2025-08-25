import java.util.Scanner;	
	
public class QuadrantCheck{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the No to check");
	System.out.println("Enter the First No");
	int a = sc.nextInt();
	System.out.println("Enter the Second No");
	int b = sc.nextInt();

	if(a == 0 && b == 0){
		System.out.println("Lies in Origin");
	}else if(a > b && a < b){
		System.out.peintln("Lies in First Quadrant");
	}else if(a < b && a > b){
		System.out.println("The Second Quadrant");
	}else if(a < b && ){
		System.out.println("Lies in Third Quadrant");
		}
	}
}