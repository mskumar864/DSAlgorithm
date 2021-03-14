package slidingwindow;

import org.omg.CORBA.INTERNAL;


//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
public class MaxOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Max no of vowel letters in given substring of S with lengh K"+ maxVowels("abceiouh",7));

	}
	
	
	  public static int maxVowels(String s, int k) {
		  
		 
		  int MaxOfVowels=Integer.MIN_VALUE;
		  
		  int windowstart=0;
		  
		  int windowsumcount=0;
		  
		  if(s.length()<k) {
			  
			  return 0;
		  }
		  
		  for(int windowend=0;windowend<s.length();windowend++) {
		
			  
			 if(s.charAt(windowend)=='a' || s.charAt(windowend)=='e' || s.charAt(windowend)=='i' || s.charAt(windowend)=='o' || s.charAt(windowend)=='u') {
				 
				 windowsumcount++;
				
				 
			 }
			 if(windowend>=k-1) {
				 MaxOfVowels=Integer.max(MaxOfVowels,windowsumcount);
				 if(s.charAt(windowstart)=='a' || s.charAt(windowstart)=='e' || s.charAt(windowstart)=='i' || s.charAt(windowstart)=='o' || s.charAt(windowstart)=='u') {
					 windowsumcount--;
					
				 }
				 windowstart++;
				 
				 
				 
			 }
				 
			  
			  
		  }
		  
		 
	        
		  
		  return MaxOfVowels;
	    }

}
