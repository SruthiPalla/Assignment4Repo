package in.neuron.main;

import java.util.*;

public class PrintDupInString {
	
		public static void main(String[] args) {


			System.out.println("Hello! Please enter a String");
			System.out.println("I will give duplicate charectors present in it");
			Scanner sc=new Scanner(System.in);
			
			String s1= sc.nextLine();
		    s1 = s1.toLowerCase();
			String result="";
			for (int i=0;i<s1.length();i++)
			{
				int count=0;
				for (int j=i+1;j<s1.length();j++) 
					{
						if( (s1.charAt(i))==(s1.charAt(j)) )
						count++;
					}
			if (count>0) {
					boolean existed=true;
					for (int k=0;k<result.length();k++)
					{
						if (s1.charAt(i)==result.charAt(k))
								existed=false;
					}
					if(existed)
					result=result+s1.charAt(i);
				}
			}
			System.out.println("Hey these are the duplicate charectors present in "+ s1 + " : " + result);

		}

	}

