package hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//brute force approach
//Time Complexity O(N2)
public class FirstRecurringcharSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,5,6,8,1,10,5};
		
	
		sorting(arr);
	}

	public static void sorting(int arr[]) {
		
		  Set<Integer> set = new HashSet<>();
		  
for (int i = 0; i < arr.length-1; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			System.out.println("recurring charterer"+arr[i]);
			return;
	}
	}
}
		System.out.println("recurring charterer not found");
	

			

	}
}
