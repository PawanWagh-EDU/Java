import java.util.Scanner;
	
public class Numbers{
	
	public static void main(Strin[] args){
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the No to Check it :");	
	int a = sc.nextInt();
	
	if(a > 0){
		System.out.println("The no is Postive :"+ a);
	}else{
		System.out.println("The no is Negative :"+ a);
	}
		
	sc.close();
	}
}