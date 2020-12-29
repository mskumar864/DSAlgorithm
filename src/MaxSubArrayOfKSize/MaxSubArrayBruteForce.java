package MaxSubArrayOfKSize;


//Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.

//Time COmplexity O(n*k)
public class MaxSubArrayBruteForce {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// System.out.println("Maximum sum of a subarray of size K: "
			//        + MaxSubArrayBruteForce.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
			    System.out.println("Maximum sum of a subarray of size K: "
			        + MaxSubArrayBruteForce.MaxSubArrayBruteForce(2, new int[] { 2, 3, 4, 1, 5 }));

	}

	private static int MaxSubArrayBruteForce(int k, int[] arr) {
		// TODO Auto-generated method stub
		
		int maxSum=0,windowSum; 
		
		for (int i = 0; i < arr.length-k; i++) {
			 windowSum=0;
			for (int j = i; j < i+k; j++) {
				
				windowSum+=arr[j];
			}
			  maxSum = Math.max(maxSum, windowSum);
			
		}
		
		
		
		return maxSum;
	}
	
	

}
