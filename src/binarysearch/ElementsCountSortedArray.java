package binarysearch;


/*
 
 Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.
 
 */




public class ElementsCountSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= { 4, 7, 7, 7, 8, 10, 10 };
		
		int firstIndex=binarySearch(arr,7,true);
		
		if(firstIndex==-1) {
			System.out.println("no occurenance");
			
		}
		else {
			int lastindex=binarySearch(arr,7,false);
			
			System.out.println("no of occurenance " + (lastindex-firstIndex+1) );
			
		}

	}
	
	
	  public static int binarySearch(final int[] A, int target,boolean searchfirst) {
	        
	        int start=0;
	        int end=A.length-1;
	        int result=-1;
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(A[mid]==target) {
	            	
	            	 result=mid;
	                if(searchfirst)
	                	end=mid-1;
	                else
	                	start=mid+1;
	            }
	         
	            else if(A[mid]>target)
	            		end=mid-1;
	      	     else
	      	         start=mid+1;
	                   
	            
	        }
	        
	        
	        return result;
	    }

}
