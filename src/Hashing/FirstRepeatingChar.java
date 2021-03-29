package Hashing;

import java.util.HashSet;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {10, 5, 3, 4, 3, 5, 6};
		System.out.println("first non repeating char"+ solve(arr));

	}
	
    public static int solve(int[] A) {
        
        int min=-1;
        HashSet set=new HashSet();
        
        for(int i=A.length-1;i>=0;i--){
            
            if(set.contains(A[i]))
                  min=A[i];
             else
              set.add(A[i]);
        }
    
        return min;
    }

}
