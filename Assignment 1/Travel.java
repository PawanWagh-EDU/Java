import java.util.Scanner;

public class Travel{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
		
	float u , a , t , v , s ;
	System.out.println("Enter The Velocity(u) , Acceleration(a) , and Time (t)");	
	u = sc.nextFloat();
	a = sc.nextFloat();	
	t = sc.nextFloat();
		
	v = u + a*t;
	s = (u + (a*t) * (a*t));

	System.out.println("The Final Velocity is :"+ v);
	System.out.println("The Distance is"+ s);
	
	sc.close();
	}
}