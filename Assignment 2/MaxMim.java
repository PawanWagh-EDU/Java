import java.util.Scanner;	
	
public class MaxMim{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the No to check");
	System.out.println("Enter the First No");
	int a = sc.nextInt();
	System.out.println("Enter the Second No");
	int b = sc.nextInt();

	if(a > b){
		System.out.println("The no is greater :"+ a);
	}elseIf(a < b){
		System.out.peintln("The no is smaller :"+ a);
	}elseIf(a = b){
		System.out.println("The no is equall ");
	}else{
		System.out.println("The no is Invalid");
		}
	}
}