package linkedlist;

//class to insert data into a linked list
public class InsertNode {

	public static void main(String[] args) {
		SinglyNode head = new SinglyNode(5);
		head.next = new SinglyNode(3);
		head.next.next = new SinglyNode(7);
		
		//insert at the last
		SinglyNode startAfterInsertion = insertSinglyNodeAtLast(head,6);
		printSinglyLinkedList(startAfterInsertion);
		printSinglyLinkedList(head); //here head will also change as something is inserted at the end of last memory pointer
		
		//insert at the beginning
		SinglyNode headAfterInsertionAtBegin= insertSinglyNodeAtBegin(head,2);
		printSinglyLinkedList(headAfterInsertionAtBegin);
		printSinglyLinkedList(head); //here head will not change as head start will be at the start element before insertion and pass by value concept
		  
		//insert at the middle SinglyNode headAfterInsertionAtMiddle=
		SinglyNode headAfterInsertionAtMiddle = insertSinglyNodeAtMiddle(head,8);
		printSinglyLinkedList(headAfterInsertionAtMiddle);
		 
	}

	private static SinglyNode insertSinglyNodeAtMiddle(SinglyNode head, int data) {
		SinglyNode addMiddle = new SinglyNode(data);
		int length = calculateLength(head);
		int mid = (length/2)+1;	
		System.out.println("mid is="+mid);
		//printSinglyLinkedList(head);
		SinglyNode prev = head;
		int pointer = 0;
		while(pointer!=(mid-1)) { //3 4 5 6 7 
			prev=prev.next;
			pointer++;
		}
		addMiddle.next = prev.next;
		prev.next = addMiddle;
		return head;
	}

	private static int calculateLength(SinglyNode head) {
		SinglyNode temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	private static SinglyNode insertSinglyNodeAtBegin(SinglyNode head, int data) {
		SinglyNode newNode = new SinglyNode(data);
		newNode.next = head;
		head = newNode;
		return head;
	}

	private static void printSinglyLinkedList(SinglyNode startAfterInsertion) {
		System.out.println("\n\n");
		while(startAfterInsertion!=null) {
			System.out.println(startAfterInsertion.data);
			startAfterInsertion = startAfterInsertion.next;
		}
	}

	private static SinglyNode insertSinglyNodeAtLast(SinglyNode head,int data) {
		SinglyNode append = new SinglyNode(data);
		append.next = null;
		if(head==null) {
			return append;
		}
		SinglyNode ref = head;
		while(ref.next!=null) {
			ref =ref.next;
		}
		ref.next = append;
		return head;
	}

}
