import java.util.Scanner;	
	
public class NumberCheck{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the No to check");
	int a = sc.nextInt();

	if(a > 0){
		System.out.println("The no is Postive :"+ a);
	}elseIf(a < 0){
		System.out.peintln("The no is Negative :"+ a);
	}elseIf(a = 0){
		System.out.println("The no is Zero");
	}else{
		System.out.println("The no is Invalid");
		}
	}
}