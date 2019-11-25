package linkedlist;

public class MergeLinkedList {

	public static void main(String[] args) {
		//create the first list
		SinglyNode headA = new SinglyNode(6);
		InsertNode.insertSinglyNodeAtLast(headA, 4);
		InsertNode.insertSinglyNodeAtLast(headA, 3);
		
		//create the second list
		SinglyNode headB = new SinglyNode(5);
		InsertNode.insertSinglyNodeAtLast(headB, 9);
		InsertNode.insertSinglyNodeAtLast(headB, 2);
		
		//merge two lists without sorting
		SinglyNode mergedList = mergeLists(headA,headB);
		PrintSinglyNode.printSinglyLinkedList(mergedList);
		
		//sort the list
		PrintSinglyNode.printSinglyLinkedList(getSortedList(headA));
	}

	//here we will apply merge sort
	//Since accessing data is pretty slow in linked list
	//quick sort and heap sort may take longer
	private static SinglyNode getSortedList(SinglyNode headA) {
		if(headA == null) {
			return headA;
		}
		
		//merge sort is performed by divide and conquer approach
		//divide
		SinglyNode sortedList = mergeSort(headA);
		return sortedList;
	}

	private static SinglyNode mergeSort(SinglyNode headA) {
		if(headA==null||headA.next==null) {
			return headA;
		}
		//to divide in two equal halves
		//we need to find out the middle element
		SinglyNode mid = getMiddle(headA);
		SinglyNode nextToMid = mid.next;
		
		//next to mid should be null to form two disjoints list
		mid.next=null;
		
		//we will divide it into two equal recursive calls
		SinglyNode firstNode = mergeSort(headA);
		SinglyNode secondNode = mergeSort(nextToMid);
				
		//time to merge
		SinglyNode sortedList = sortedMerge(firstNode,secondNode);
		return sortedList;
	}

	private static SinglyNode sortedMerge(SinglyNode firstNode, SinglyNode secondNode) {
		if(firstNode==null&&secondNode==null) {
			return null;
		}
		if(firstNode==null) {
			return secondNode;
		}
		if(secondNode==null) {
			return firstNode;
		}
		
		SinglyNode merged = null;
		if(firstNode.data<=secondNode.data) {
			merged = firstNode;
			merged.next = sortedMerge(firstNode.next,secondNode);
		} else {
			merged = secondNode;
			merged.next = sortedMerge(firstNode,secondNode.next);
		}
 		return merged;
	}

	//method to find out the middle element
	private static SinglyNode getMiddle(SinglyNode headA) {
		if(headA==null) {
			return headA;
		}
		SinglyNode twoStepMove = headA.next;
		SinglyNode oneStepMove = headA;
		
		while(twoStepMove!=null) {
			twoStepMove = twoStepMove.next;
			if(twoStepMove!=null) {
				twoStepMove = twoStepMove.next;
				oneStepMove = oneStepMove.next;
			}
		}
		
		/*
		 * System.out.println("Returning the list from the middle element");
		 * InsertNode.printSinglyLinkedList(oneStepMove);
		 */
		 
		return oneStepMove;
	}

	//merge two lists in the same order
	private static SinglyNode mergeLists(SinglyNode headA, SinglyNode headB) {
		SinglyNode temp = headA;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = headB;
		return headA;
	}

}
