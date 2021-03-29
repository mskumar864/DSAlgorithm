package LinlkedLilst;

public class ReverseLinkedList {
	
	static Node head;
	
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void printList(Node head) {
    	
    	Node currNode=head;
    	while(currNode!=null) {
    		
    		System.out.print(currNode.data+"->");
    		currNode=currNode.next;
    		
    	}
    }
    
    public Node reverseLists(Node head) {
    	
    	Node currNode=head;
    	Node next=null;
    	Node prev=null;
    	while(currNode!=null) {
    		
   
    		 next=currNode.next;
    			currNode.next=prev;
    		 prev=currNode;
    	
    		currNode=next;
    		
    		
    	}
    	
    	
    		
    		head=prev;
  
    	
    	return head;
    	
    	
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList linkedList=new ReverseLinkedList();
		
		linkedList.head=new Node(5);
		linkedList.head.next = new Node(15);
		linkedList.head.next.next=new Node(25);

		
		System.out.println("Given Linked list");
		linkedList.printList(head);
		
		
		System.out.println("\n reverse Linked list");
		
		head=linkedList.reverseLists(head);
		linkedList.printList(head);
		
	}
	
	
	

}
