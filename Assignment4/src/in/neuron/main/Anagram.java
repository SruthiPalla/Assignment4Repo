package in.neuron.main;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
			
			System.out.println("Hello please enter two strings: ");
			Scanner sc=new Scanner(System.in);
			
		    String str1 = sc.nextLine();
		    String str2 = sc.nextLine();
		    
		    str1=str1.replace(" ", "");
		    str2=str2.replace(" ", "");
		    		    	
		    for(int j=0;j<str1.length();j++) {
				    for(char i='A' ;i<='Z';i++) {
				    	if(str1.charAt(j)==i) {
				    		char c=(char) (str1.charAt(j)+32);
				    		str1=str1.replace(str1.charAt(j), c);
				    	}
				    	if(str2.charAt(j)==i) {
				    		char c=(char) (str2.charAt(j)+32);
				    		str2=str2.replace(str2.charAt(j), c);
				    	}
		    	}
		    	
		    }
		    
		    if(str1.length() == str2.length()) {

		      
		      char[] ch1 = str1.toCharArray();
		      char[] ch2 = str2.toCharArray();

		      for(int i=0;i<str1.length();i++) {
		    	  for (int j1=1;j1<str1.length();j1++) {
		    		  if(ch1[i]>ch1[j1] ) {
		    			  char temp=ch1[j1];
		    			  ch1[j1]=ch1[i];
		    			  ch1[i]=temp;
		    		  }
		    			  
		    			  if(ch2[i]>ch2[j1] ) {
			    			  char temp=ch2[j1];
			    			  ch2[j1]=ch2[i];
			    			  ch2[i]=temp;
		    		  }
		    	  }
		    		  
		      }
		      boolean result=false;
		      for (int i=0;i<str1.length();i++) {
		    	  if (ch1[i]==ch2[i])
			    	  result =true;
		      }
		      
		      if(result) {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }
		
	}

}
