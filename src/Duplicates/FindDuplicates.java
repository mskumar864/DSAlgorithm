package Duplicates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIme complexity o(n)          Space complexity- o(n)

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,4,8,9,2};
		boolean isDuplicate= containsDuplicate(nums);
		
		if(isDuplicate)
			System.out.println("duplicate");
		else
			System.out.println("no duplicate");
	}
	
	
	  public static boolean  containsDuplicate(int[] nums) {
	        
		  
		  Set set=new HashSet<>(nums.length);	
		  
		for (int i=0 ; i<nums.length;i++) {
			
			if(set.contains(nums[i])) {
			return true;	
			}
		
			set.add(nums[i]);
		}
	
		  
		  return false;
	    }

}
