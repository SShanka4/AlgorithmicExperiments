package linkedlist;

//class yto print the given node
public class PrintSinglyNode {

	public static void printSinglyLinkedList(SinglyNode startAfterInsertion) {
		System.out.println("\n\n");
		while(startAfterInsertion!=null) {
			System.out.println(startAfterInsertion.data);
			startAfterInsertion = startAfterInsertion.next;
		}
	}

}
