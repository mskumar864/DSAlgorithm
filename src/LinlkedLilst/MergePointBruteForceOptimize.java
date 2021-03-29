package LinlkedLilst;

import java.util.Stack;

import LinlkedLilst.LinkedList.Node;


/*
 
 Time Complexity: O(m+n) 
Auxiliary Space: O(1)
 */
public class MergePointBruteForceOptimize {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		LinkedList list1=new LinkedList();
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		list1.addNode(40);
		list1.addNode(50);
		list1.addNode(60);
		System.out.println("list one");
		list1.printList();
		
		
		
		LinkedList list2=new LinkedList();
		list2.addNode(15);
		list2.addNode(25);
		list2.addNode(35);
		list2.addNode(40);
		list2.addNode(50);
		list2.addNode(60);
		
		System.out.println("\nlist two");
		list2.printList();

		 int data =getNode(list1,list2);
	
		System.out.println("Merge point"+ data);
		
	}
	
	
	
	
	  /*Takes head pointer of the linked list and 
    returns the count of nodes in the list */
	static int  getCount(Node node) 
    { 
        Node current = node; 
        int count = 0; 
  
        while (current != null) { 
            count++; 
            current = current.next; 
        } 
  
        return count; 
    } 
    
    
    
    
	
	 public static int getNode(LinkedList list1, LinkedList list2) {
		 
		 
		 
		 int c1 = getCount(list1.head); 
	        int c2 = getCount(list2.head); 
	        int d; 
	  
	        if (c1 >= c2) { 
	            d = c1 - c2; 
	            return getIntesectionNode(d, list1.head, list2.head); 
	        } 
	        else { 
	            d = c2 - c1; 
	            return getIntesectionNode(d, list2.head, list1.head); 
	        } 
		 

		 
	    }
	 
	 static int getIntesectionNode(int d, Node node1, Node node2) 
	    { 
	        int i; 
	        Node current1 = node1; 
	        Node current2 = node2; 
	        for (i = 0; i < d; i++) { 
	            if (current1 == null) { 
	                return -1; 
	            } 
	            current1 = current1.next; 
	        } 
	        while (current1 != null && current2 != null) { 
	            if (current1.data == current2.data) { 
	                return current1.data; 
	            } 
	            current1 = current1.next; 
	            current2 = current2.next; 
	        } 
	  
	        return -1; 
	    } 
	  

}
