package bst;

public class InsertBST {

	public static void main(String[] args) {
		int[] arr = {5,6,12,4,3,8};
		TreeNode node = CreateBSTUsingArrays.constructBST(arr);
		TreeNode newNode  = insertNode(node,7);
		printInOrderTraversal(newNode);
	}

	//insert the node into the tree
	private static TreeNode insertNode(TreeNode node, int data) {
		//if tree is null or no element in the tree
		if(node==null) {
			node = new TreeNode(data);
			return node;
		}
		//since we do not allow duplicates
		//if the value matches, same node should be returned
		if(node.val==data) {
			return node;
		}
		if(node.val<data) {
			 node.right = insertNode(node.right,data);
		} else {
			 node.left = insertNode(node.left,data);
		}
		return node;
	}
	

	//check insertion after printing inorder traversal which is sorted order of elements
	private static void printInOrderTraversal(TreeNode newNode) {
		if(newNode==null) {
			return;
		}
		printInOrderTraversal(newNode.left);
		System.out.println(newNode.val);
		printInOrderTraversal(newNode.right);
	}

}
