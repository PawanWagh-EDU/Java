//17.Write a program to accept n numbers from the user and store them in an array such that the elements are in the sorted order. 
//Display the array. Write separate functions to accept and display the array. 

import java.util.Scanner;
public class SortDisplayArrayUsingFunctions{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	sort(a,n);
	display(a,n);
}

	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void display(int a[],int n){
		System.out.println("\narray elements are:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

	public static void sort(int a[],int n){
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	}

}
