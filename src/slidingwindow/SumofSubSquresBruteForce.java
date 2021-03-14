package slidingwindow;


//Given an n x n square matrix, find sum of all sub-squares of size k x k

/*
 
 Input:
n = 5, k = 3
arr[][] = { {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5},
         };
Output:
       18  18  18
       27  27  27
       36  36  36
 
 */
public class SumofSubSquresBruteForce {

	// Size of given matrix 
    static final int n = 5; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] = {{1, 1, 1, 1, 1}, 
                       {10, 2, 9, 2, 2}, 
                        {3, 3, 8, 3, 3}, 
                       {4, 4, 4, 4, 4}, 
                       {5, 5, 5, 5, 5}}; 
		
		numSubmatrixSumTarget(mat,3);

	}

	
	  public static void numSubmatrixSumTarget(int[][] matrix, int k) {
		  
		  int maxsub=Integer.MIN_VALUE;
		 
		 for(int i=0;i<n-k+1;i++) {
			 
			 for(int j=0;j<n-k+1;j++) {
				 
				 
				 // Calculate and print sum of  
	                // current sub-square 
	                int sum = 0; 
	                for (int p = i; p < k+i; p++) 
	                    for (int q = j; q < k+j; q++) 
	                        sum += matrix[p][q]; 
	  
	                System.out.print(sum+ " "); 
	                maxsub=Math.max(maxsub, sum);
	              
			 
		 }
			  System.out.println(); 
		 }
		 
		  System.out.println(maxsub); 
     
	    }
	  
	  
}
