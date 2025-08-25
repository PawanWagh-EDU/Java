import java.util.Scanner
	
public class NoBetween{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no to check");

	System.out.println("Enter First No :");	
	int a = sc.nextInt();
	System.out.println("Enter Second No :");
	int b = sc.nextInt();
	System.out.println("Enter Third No :");
	int c = sc.nextInt();	
	
	if((a>b || a<c)||(a>c && a<b)){
		System.out.println(a + "is between" + b + " and " + C);
	}else{
		System.out.println(a + "is not between" + b + " and " + C);
	}
	}
}