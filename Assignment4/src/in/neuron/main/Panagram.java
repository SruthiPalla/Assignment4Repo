package in.neuron.main;

import java.util.Scanner;

public class Panagram {
	

	public static void main(String[] args) 
	{
		
		System.out.println("Hello please enter a string: ");

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		boolean flag=false;		
		s1=s1.replace(" ", "");
		
		for(int j=0;j<s1.length();j++) {
		    for(char c='a' ;c<='z';c++) {
		    	if(s1.charAt(j)==c) {
		    		char ch=(char) (s1.charAt(j)-32);
		    		s1=s1.replace(s1.charAt(j), ch);
		    	}
		    }
		}
		System.out.println(s1);
	
		
		char[] ch=s1.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  
			}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				flag=true;
			}
		}
		if(flag==false)
		System.out.println("Hey! you have entered a pangram");
		else
			System.out.println("Hey! It's not a pangram");		
	

	}
}
