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
public class SumofSubSquresSlideWindow {

	// Size of given matrix 
    static final int n = 5; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] = {{1, 1, 1, 1, 1}, 
                       {10, 2, 9, 2, 2}, 
                        {3, 3, 8, 3, 3}, 
                       {4, 4, 4, 4, 4}, 
                       {5, 5, 5, 5, 5}}; 
		
		numSubmatrixSumTarget(mat,38,3);

	}

	
	  public static void numSubmatrixSumTarget(int[][] matrix, int targetsum,int k) {
		  
		 // int maxsub=Integer.MIN_VALUE;
		  
		  int windowssum=0;
		  int noofsubarrays=0;
		 
		 for(int i=0;i<n-k+1;i++) {
			 
			 for(int j=0;j<n-k+1;j++) {
				 
				  
				 windowssum=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
						 matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]
						 + matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				 if(windowssum==targetsum) {
					 noofsubarrays++;
				 }
				 windowssum=0;
	
			 
		 }
			  System.out.println(); 
		 }
		 
	//	  System.out.println(maxsub); 
		  System.out.println("noofsubarrays"+noofsubarrays); 
     
	    }
	  
	  
}
