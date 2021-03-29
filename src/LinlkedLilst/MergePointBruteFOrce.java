package LinlkedLilst;

import LinlkedLilst.LinkedList.Node;
/*
Time Complexity: O(m*n) 
Auxiliary Space: O(1)
*/
public class MergePointBruteFOrce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		list1.addNode(40);
		list1.addNode(50);
		System.out.println("list one");
		list1.printList();
		
		
		
		LinkedList list2=new LinkedList();
		list2.addNode(15);
		list2.addNode(25);
		list2.addNode(30);
		list2.addNode(40);
		list2.addNode(50);
		
		System.out.println("\nlist two");
		list2.printList();

		Node node=getIntersectionNode(list1,list2);
		
		if(node!=null)
		
		System.out.println("Merge point"+ node.data);
		
	}
	
	 public static Node getIntersectionNode(LinkedList list1, LinkedList list2) {
		 
		 Node node=null;
		 
		 Node list1node=list1.head;
		 
System.out.println(list1node.data);


		 
		 
		 while(list1node!=null) {
			 

			 Node list2node=list2.head;

			 System.out.println(list2node.data);
			 
			 while(list2node!=null) {
				 
				 System.out.println(list1node.data);


				 System.out.println(list2node.data);
				 
				 if(list1node.data==list2node.data) {
					 
						
					 return list1node;
				 }
				 
				 list2node=list2node.next;
				 
			 }
			 
			 list1node=list1node.next;
		 }
		 
		 
		 return node;
		 
	    }

}
