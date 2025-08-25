import java.util.Scanner;
	
public class PofitLoss{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the Cost Price :");
	int cp = sc.nextInt();
	
	System.out.println("Enter the Selling Price :");
	int sp = sc.nextInt();
	
	if(sp > cp){
		profit = sp - cp;
		System.out.println("You are in Profit of : "+ profit);
	}else{
		loss = cp - sp
		System.out.println("You are in Loss of : "+ loss);
	}
	
	sc.close();
	}	
}