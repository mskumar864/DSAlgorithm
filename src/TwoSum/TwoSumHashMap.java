package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,-5,0,10,2,3,1,4};
		int target=10;
		twoSum(nums,target);

	}
	
	
	 public static void twoSum(int[] nums, int target) {
		    Map<Integer, Integer> map = new HashMap();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            //return new int[] { i, map.get(complement) };
		        	//System.out.println(i+ " "+map.get(complement));
		        	System.out.println(nums[i]+ " "+complement);
		        }
		    }
		   // throw new IllegalArgumentException("No two sum solution");

}
}
