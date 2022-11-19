package in.neuron.main;

import java.util.Scanner;

public class CountVowelsConstantsSpecialchars {

	public static void main(String[] args) {

		System.out.println("Hello! Please enter a String");
		Scanner sc=new Scanner(System.in);
		
		int vowels=0, constants=0, special=0;
		String s1= sc.nextLine();
	    s1 = s1.toLowerCase();
	    s1=s1.replace(" ", "");
		String result="";
		int k=0;
		
		
		for (int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)=='a' ||s1.charAt(i)== 'e' ||s1.charAt(i)== 'i' ||s1.charAt(i)== 'o' ||s1.charAt(i)== 'u' ) {
				vowels++;
			}
			else 
			{
				for (int j='a'; j<'z'; j++) {
				if(s1.charAt(i)==j)
					constants++;
				else
					special= s1.length()-(vowels+constants);
				}
			
				
			}
				
		}
		
		System.out.println("Vowels: " + vowels + " Constants : " + constants + " Special charectors : " + special);
		System.out.println("Hey! Iam not considering space you have entered as special charector");
	}

}
