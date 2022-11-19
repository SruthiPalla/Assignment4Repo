package in.neuron.main;
import java.util.*;

public class PalindromeNbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello! Please enter a number..");
		System.out.println("I will tell you if it is palindrome or not");
		
		int num=sc.nextInt();
		int temp=num,r,sum=0;
		while(num>0) {
		r=num%10;
		sum=(sum*10)+r;    
		num/=10;
		}
		
		if (temp==sum)
			System.out.println("Hurray! Its a palindrome");
		else
			System.out.println("Sorry! Its not a palindrome");
	}

}
