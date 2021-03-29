package LinlkedLilst;

import LinlkedLilst.ReverseLinkedList.Node;

public class LinkedList {
	
	 Node head=null;
	
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void printList() {
    	
    	Node currNode=head;
    	while(currNode!=null) {
    		
    		System.out.print(currNode.data+"->");
    		currNode=currNode.next;
    		
    	}
    }
    
    
    public void addNode(int data) {
    	
    	Node node=new Node(data);
    	
    	if(head==null) {
    		head=node;
    		
    	}
    	else {
    	Node currNode=head;
    	while(currNode.next!=null) {
    		
    		
    		currNode=currNode.next;
    		
    	}
    	currNode.next=node;
    	
    }
    }
    
    

}
