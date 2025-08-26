import java.util.Scanner;
	
public class NoAddition{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the No 1 :");
	int a = sc.nextInt();
	
	System.out.println("Enter the Operator :");
	char c = sc.next().charAt(0);

	System.out.println("Enter the No 2 :");
	int b = sc.nextInt();
	
	switch(c){
	
	case '+' -> System.out.println("The Addition is :"+ (a+b));
	case '-' -> System.out.println("The Addition is :"+ (a-b));
	case '/' -> System.out.println("The Addition is :"+ (a/b));
	case '*' -> System.out.println("The Addition is :"+ (a*b));
		}
	sc.close();
	}
}