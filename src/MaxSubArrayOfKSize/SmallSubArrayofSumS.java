package MaxSubArrayOfKSize;
//Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
public class SmallSubArrayofSumS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minimum Subarray of sum targetsum  "
		       + SmallSubArrayofSumS.findSmallSubArrayofSumS(10, new int[] { 2, 1, 5, 1, 3, 2,8 }));
				
	}

	private static int findSmallSubArrayofSumS(int targetSum, int[] arr) {
		// TODO Auto-generated method stub
		
		int minSubArray=0;
		int windowStart=0;
		
		int windowSum=0;
		
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum+=arr[windowEnd];
		      // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
			while (windowSum >= targetSum) {
				minSubArray=windowEnd-windowStart+1;
				 windowSum -= arr[windowStart];
				windowStart++;
			
		}
		}
		
		
		return minSubArray;
	}

}
