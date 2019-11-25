package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		SinglyNode node = new SinglyNode(5);
		InsertNode.insertSinglyNodeAtLast(node, 6);
		InsertNode.insertSinglyNodeAtLast(node, 7);
		InsertNode.insertSinglyNodeAtLast(node, 8);
		PrintSinglyNode.printSinglyLinkedList(node);
		System.out.println("Reversed list = ");
		PrintSinglyNode.printSinglyLinkedList(reverseList(node));
	}
	
	//Time complexity: O(n);where n is the length of the list
	//Space complexity: O(1) as we are not using any extra space
	public static SinglyNode reverseList(SinglyNode node) {
		SinglyNode prev = null; //to keep track of previous node
		SinglyNode curr = node; //to keep track of current node
		SinglyNode temp = node; //to keep track of pointers in list
		//get the prev pointer to second last of the node
		//and the current pointer to last node
		while(temp!=null) {
			temp=curr.next; //move temp to the next element in the list
			curr.next=prev; //change the pointing location of current to prev
			prev=curr; //move prev to the next location
			curr = temp; //current should be at the next loc to prev
		}
		//after all elements are located
		//move the node/head pointer to the last element 
		//which is previous in this case
		node=prev; 
		return node;
	}

}
