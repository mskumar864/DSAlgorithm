package MaxSubArrayOfKSize;

//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.

//Time COmplexity O(n)
// Space O(1)
public class MaxSubArraySlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Maximum sum of a subarray of size K:  "
		        + MaxSubArraySlidingWindow.MaxSubArrayBruteForce(3, new int[] { 2, 3, 4, 1, 5 }));
	}

	private static int MaxSubArrayBruteForce(int k, int[] arr) {
		
		int maxSum=0,windowSum=0;
		// TODO Auto-generated method stub
		int windowStart=0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
	
			windowSum+=arr[windowEnd];
			if (windowEnd >= k - 1) {
				  maxSum = Math.max(maxSum, windowSum);
				  windowSum -= arr[windowStart]; 
				  windowStart++;// slide the window ahead
			}
			
		}
		
		return maxSum;
	}

}
