package hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Time Complexity O(n)
//Space O(n)

public class FirstRecurringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,5,6,8,1,10,10};
		
	
		recurringChar(arr);
	}
	
	
	public static void recurringChar(int arr[]) {
		
		  Set<Integer> set = new HashSet<>();
			
			for (int i = 0; i < arr.length; i++) {
				if(set.contains(arr[i])) {
					System.out.println("recurring charterer"+arr[i]);
					return;
				}
				set.add(arr[i]);
			
				
			}
			System.out.println("recurring charterer not found");
	}

}
