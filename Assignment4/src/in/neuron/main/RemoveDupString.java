package in.neuron.main;

import java.util.*;

public class RemoveDupString {

	public static void main(String[] args) {


		System.out.println("Hello! Please enter a String");
		System.out.println("I will remove duplicate charectors from it and give it to you..");
		Scanner sc=new Scanner(System.in);
		
		String s1= sc.nextLine();
	    s1 = s1.toLowerCase();
		String result="";
		for (int i=0;i<s1.length();i++)
		{
			int count=0;
			for (int j=0;j<result.length();j++) 
				{
					if( (s1.charAt(i))==(result.charAt(j)) )
					count++;
				}
			if (count==0)
			result=result+s1.charAt(i);				
		}
		if (result.equals(s1))
			System.out.println("No dupliactes found to remove from " + s1);
		else
		System.out.println("Here is your String: " + result);

	}

}
