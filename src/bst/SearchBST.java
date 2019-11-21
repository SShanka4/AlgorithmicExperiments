package bst;

//Searching has O(log n) time complexity.
//SInce we use divide and conquer and almost half the tree
//is ruled out on every iteration
public class SearchBST {

	public static void main(String[] args) {
		int[] arr = {5,8,3,6,1,9,10,23,24,12,11,0};
		TreeNode root = CreateBSTUsingArrays.constructBST(arr);
		System.out.println("isPresent=: "+searchNode(root,8));
		System.out.println("Node returned:-"+getSearchedNode(root,8));
		System.out.println("Level where Node is Present:-"+getLevelOfSearchedNode(root,24,1));
	}

	private static int getLevelOfSearchedNode(TreeNode node, int data,int level) {
		//return -1 or not present if node passed is null
		if(node==null) {
			return -1;
		}
		//return the level if the data matches
		if(node.val==data) {
			return level;
		}
		//if the value is greater then we should move towards the lft node recursively
		//else vice versa
		if(node.val>data) {
			return getLevelOfSearchedNode(node.left, data,level+1);
		} else {
			return getLevelOfSearchedNode(node.right, data,level+1);
		}
	}

	//Search and return the node
	private static TreeNode getSearchedNode(TreeNode node, int data) {
		//check if node is null or the value matches then return from here
		if(node==null||node.val==data) {
			return node;
		}
		//if the value is greater then we should move towards the lft node recursively
		//else vice versa
		if(node.val>data) {
			return getSearchedNode(node.left, data);
		} else {
			return getSearchedNode(node.right, data);
		}
	}

	//Search and check if the node is present
	public static boolean searchNode(TreeNode node,int data) {
		if(node==null) {
			return false;
		}
		if(node.val==data) {
			return true;
		} else if(node.val>data) {
			 return searchNode(node.left,data);
		} else {
			 return searchNode(node.right, data);
		}
	}
	
	
	
	

}
