package binarysearch;

public class RotatedArray {

	
	/*
	 
	  Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.

NOTE 1: Also think about the case when there are duplicates. Does your current solution work? How does the time complexity change?*
PROBLEM APPROACH:

Note: If you know the number of times the array is rotated, then this problem becomes trivial. If the number of rotation is x, then minimum element is A[x].
Lets look at how we can calculate the number of times the array is rotated.

Complete solution in the hints.
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,5,4,1,3};
		
		System.out.println("min element"+findMinIndex(arr));
	}
	
	
	public static int findMinIndex(int arr[]) {
		
		int low =0;
		int high=arr.length-1;
		int n=arr.length;
		while(low<=high) {
			
			if(arr[low]<=arr[high]) {
				
				return low;
			}
			
			int mid=(low+high)/2;
			
			int prevNum=(mid+n-1)%n;
			int nextNum=(mid+1)%n;
			
			if(arr[mid]<prevNum && arr[mid]<nextNum)
				return mid;
			else if(arr[mid]<=arr[high])
					high=mid-1;
			else if(arr[mid]>=arr[low])
					low=mid+1;
			
			
		}
		
		
		return -1;
		
	}

}
