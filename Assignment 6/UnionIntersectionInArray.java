//15.Write a program to find the union and intersection of the two arrays. Store the result in another arrays. 

import java.util.Scanner;
public class UnionIntersectionInArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of first array & elements :");
	int n1=sc.nextInt();
	int a1[]=newint[n1];
	accept(a1);

	System.out.println("Enter size of second array & elements :");
	int n2=sc.nextInt();
	int a2[]=newint[n2];
	accept(a2);

	int unionArr[]=new int[n1+n2];
	union(a1,a2,unionArr);
  }
	
	public static void accept(int a[]){
		Scanner sc = new Scanner(System.in);
    		for (int i = 0; i < a.length; i++) {
        		a[i] = sc.nextInt();
   		}
	}

	public static void union(int a1[],int a2[],int unionArr[]){
	int ind=0;
	for(int i:a1){
		
	}
	}

}