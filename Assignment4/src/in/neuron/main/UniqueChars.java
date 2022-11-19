package in.neuron.main;

import java.util.*;

public class UniqueChars {
	
		public static void main(String[] args) {


			System.out.println("Hello! Please enter a String");
			System.out.println("I will tell you the unique charectors present in it");
			Scanner sc=new Scanner(System.in);
			
			String s1= sc.nextLine();
		    s1 = s1.toLowerCase();
			String result="";
			for (int i=0;i<s1.length();i++)
			{
				int count=0;
				for (int j=0;j<s1.length();j++) 
					{
						if( (s1.charAt(i))==(s1.charAt(j)) )
						count++;
						
					}
				
			if (count==1)
				result=result+s1.charAt(i);
			}
	
			System.out.println("Unique charectors present in "+ s1 + " are : " + result);

		}

	}

