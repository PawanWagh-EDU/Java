import java.util.Scanner;
	
public class SwitchCase{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. Equality 2. Less than 3. Quotient and reminder 4. Range 5. Swap");
	int c = sc.nextInt();
	System.out.println("Enter X :");
	int x = sc.nextInt();
	System.out.println("Enter Y :");
	int y = sc.nextInt();
		
	switch(c){
	
	case 1 : if(x == y){
			System.out.println("Both are equal:");
			}else{
			System.out.println("Both are not equal:");
			}
			break; 

	case 2 : 	if(x > y){
			System.out.println(" X is greater:");
			}else{
			System.out.println("Y is greater:");
			}
			break;

	case 3 : 	int quotient = x / y;
                	int remainder = x % y;
                	System.out.println("Quotient: " + quotient);
                	System.out.println("Remainder: " + remainder);
                	break;

	case 4 :	System.out.print("Enter the number to check range: ");
                	int num = sc.nextInt();
                	int min = Math.min(x, y);
                	int max = Math.max(x, y);
                	if (num >= min && num <= max) {
                    	System.out.println(num + " lies between " + x + " and " + y);
                	} else {
                   	System.out.println(num + " does not lie between " + x + " and " + y);
                	}
                	break;
			
	
	case 5 : 	int temp = x; x = y; y = temp;
		  	System.out.println("x" + x +"and y" + y);
			break;

	default : 
			System.out.println("After Swapping X = "+ x +"and Y = "+y);
			break;
		}
			sc.close();
	
	}
}