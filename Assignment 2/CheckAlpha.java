import java.util.Scanner;
	
public class CheckAlpha{
	public static void main(String[] args){

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the lower Alphabet");
	char a = nextChar();
	
	if(a = "a" && "A" || a = "e" && "E" || a = "o" && "O" || a = "i" && "I" || a = "u" && "U"){
		System.println("The Alphabet is Vovels :"+ a);
	}else{
		System.out.println("Not a Vowels or Invalid Alphabet");
		
	}
	
	sc.close();
	}
}