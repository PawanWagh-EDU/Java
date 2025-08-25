import java.util.Scanner;
	
public class LeapYear{
	public static void main(String[] args){

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Year to check it is leap or not");
	char a = nextChar();
	
	if(a / 4 || a / 400 || a !/ 100){
		System.println("The Year is Leap Year : "+ a);
	}else{
		System.out.println("Not a Leap Year : "+ a);
		
	}
	
	sc.close();
	}
}