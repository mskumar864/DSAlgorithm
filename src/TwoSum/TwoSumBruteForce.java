package TwoSum;
// Time Complexity O(n2)
//Space O(1)
public class TwoSumBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,-5,0,10,2,3,1,4};
		int target=5;
		twoSum(nums,target);
	}
	
	public static void twoSum(int[] nums, int target) {
		
		int compliment;
	    for (int i = 0; i < nums.length; i++) {
	    	 compliment=target - nums[i];
	    	
	    	
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == compliment) {
	              //  return new int[] { i, j };
	            	
	            	System.out.println(nums[i]+" "+nums[j]);
	            }
	        }
	    }
	  //  throw new IllegalArgumentException("No two sum solution");
	}

}
