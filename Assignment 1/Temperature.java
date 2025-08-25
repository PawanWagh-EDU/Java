import java.util.Scanner;
public class Temperature{	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float f,c,k;

		System.out.println("Enter the Temperature in Fahrenheit :");
		f = sc.nextFloat();
		
		c = (5.0f / 9)*(f-32);
		k = c + 273.15f;

		System.out.println("The Temperature in Celcius :"+ c);
		System.out.println("The Temperatue in kelvin :"+ k);
	
		sc.close();
	 
	}
}