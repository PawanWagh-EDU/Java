import java.util.Scanner;
	
public class Math{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);	
	float am , hm , a , b ;

	System.out.println("Enter the No to Print :");
	am = sc.nextFloat();
	hm = sc.nextFloat();
	
	am = (a+b);
	hm = (a/b) * (a+b);
 	
	System.out.println("The Arthematic mean is :"+ am);
	System.out.println("The Harmonic mean is :"+ hm);
	
	sc.close();

	}
}