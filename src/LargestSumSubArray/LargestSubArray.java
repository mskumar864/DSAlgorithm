package LargestSumSubArray;

public class LargestSubArray {
	public static void main(String[] args) {
	 int [] a = {-7,-1,-4,-2,0,1,5,7,2,-3}; 
     System.out.println("Maximum contiguous sum is " + 
                                    maxSubArraySum(a)); 
}

     static int maxSubArraySum(int a[]) 
     { 
         int size = a.length; 
         int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
     int start=0;
     int end=0;
     int s=0;
         for (int i = 0; i < size; i++) 
         { 
             max_ending_here = max_ending_here + a[i]; 
             if (max_so_far < max_ending_here) { 
                 max_so_far = max_ending_here; 
                 start=s;
                 end=i;
             }
             if (max_ending_here < 0) {
                 max_ending_here = 0; 
             	 s=i+1;
                 
             }
         
         } 
         
         System.out.println("Maximum contiguous sum is " 
                 + max_so_far); 
System.out.println("Starting index " + start); 
System.out.println("Ending index " + end); 
         return max_so_far; 
     }

}
