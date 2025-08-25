import java.util.Scanner;
	
public class EmployeeSalary{
	public static void main(String[] args){
	
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter Employee ID :");
	int id = sc.nextInt();	

	System.out.println("Enter Basic Salary :");
	double basic = sc.nextDouble();
	
	double hra, da, pt, gross , th; 
	
	hra = 0.10 * basic;	
	da = 0.30 * basic;
	pt = 0.05 * basic;
	
	gross = basic + hra + da;
	th = gross - pt;	
	
	System.out.println("Employee ID :"+ id);
	System.out.println("Basic Salary :"+ basic);
	System.out.println("House Rent Allounce is :(10%)"+ hra);
	System.out.println("Dearness Allowance is :(30%)"+ da);
	System.out.println("Professional Tax  is :(5%)"+ pt);
	System.out.println("Take Home Salary is :"+ th);
	
	sc.close();
	
	} 
}