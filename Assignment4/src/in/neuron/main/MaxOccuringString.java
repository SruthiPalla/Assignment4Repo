package in.neuron.main;

import java.util.*;

public class MaxOccuringString {
	
		public static void main(String[] args) {


			System.out.println("Hello! Please enter a String");
			System.out.println("I will give duplicate charectors present in it");
			Scanner sc=new Scanner(System.in);
			
			String s1= sc.nextLine();
		    s1 = s1.toLowerCase();
			String result="";
			char Max = 0;
			int maxcount=0;
			for (int i=0;i<s1.length();i++)
			{
				int count=1;
				for (int j=i+1;j<s1.length();j++) 
					{
						if( (s1.charAt(i))==(s1.charAt(j)) )
						count++;
					}
				
				if(count > maxcount)
				{
			    Max=s1.charAt(i);
			    maxcount=count;
				}
			}

			System.out.println("Max occuring charector is " + Max +" of " + maxcount + " times.");

		}

	}

