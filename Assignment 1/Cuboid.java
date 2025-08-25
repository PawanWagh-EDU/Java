import java.util.Scanner;
	
public class Cuboid{
		
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
		
	float sa , vol , l , b , h ;	

	System.out.println("Enter the Length, Bridth, Height of Cubiod");
	
	sa = 2((l*b) + (l*h) + (b*h));
	vol = l * b * h ;
	
	System.out.println("Surface area of Cuboid is :"+ sa);
	System.out.println("Volume of Cuboid is :"+ vol);	
	
	sc.close();
	
	}
}