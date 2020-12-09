package Duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



//TIme complexity o(nlog n) Heap sort-o(nlogn), Sweeping through array o(on)         Space complexity- o(1)

public class FindDuplicateSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums= {1,4,8,9,2,9,1};
		boolean isDuplicate= containsDuplicate(nums);
		
		if(isDuplicate)
			System.out.println("duplicate");
		else
			System.out.println("no duplicate");
	}
	
	
	  public static boolean  containsDuplicate(int[] nums) {
	        
		  
		  Arrays.sort(nums);
		  
		for (int i=0 ; i<nums.length-1;i++) {
			
			if(nums[i]==nums[i+1])
				return true;
		}
	
		  
		  return false;
	    }

	

}
