package io.sb.datastructures.linkedlist;

/*
  1) Dynamic size
  2) Ease of insertion/deletion where as with Arrays Insertion and Deletion 
     is expensive and need to move all the elements
  3) Random Access is not possible, always need to start with head Node
  4) Accessing an element in an array is fast, 
     while Linked list takes linear time, so it is quite a bit slower
    
  Reference Links:
  https://www.geeksforgeeks.org/linked-list-vs-array/
  https://www.geeksforgeeks.org/linked-list-set-1-introduction/
  
 * 
 */

public class LinkedList {
	// Head Node
	Node head;

	public LinkedList() {
		
	}
	
	// Traverse the linked list from head node to the end
	public void traverseLinkedList() {
		
			Node currentNode = head;
			while(currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
	}

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.head = new Node(2);
		Node second = new Node(5);
		Node third = new Node(8);
		
		// link the nodes
		linkedList.head.next = second;
		second.next = third;
		
		linkedList.traverseLinkedList();

	}

}


