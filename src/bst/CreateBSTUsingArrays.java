package bst;

import java.util.Arrays;

public class CreateBSTUsingArrays {

	static int count =0;
	public static void main(String[] args) {
		int[] treeArray = {5,2,8,6,3,4};
		Arrays.sort(treeArray);
		TreeNode root = constructTrrHalf(treeArray,0,5);
		printInOrder(root);
	}

	public static TreeNode constructBST(int[] treeArray) {
		TreeNode node;
		//sort the array
		Arrays.sort(treeArray); //2,3,4,5,6,8
		TreeNode root = constructTrrHalf(treeArray,0,treeArray.length-1);
		return root;
	}
	
	private static TreeNode constructTrrHalf(int[] treeArray, int i, int length) {
		if(i>length) {
			return null;
		}
		int mid = (length + i)/2;
		TreeNode rootNode = new TreeNode(treeArray[mid]);
		rootNode.left = constructTrrHalf(treeArray,i,mid-1);
		rootNode.right = constructTrrHalf(treeArray,mid+1,length);
		return rootNode;
	}
	
	public static void printInOrder(TreeNode rootNode) {
		if(rootNode==null) {
			return;
		}
		
		printInOrder(rootNode.left);
		System.out.println(rootNode.val);
		printInOrder(rootNode.right);
	}
	
	private static int getTreeHeight(TreeNode root) {
		if(root==null) {
			return -1;
		}
		int left = getTreeHeight(root.left);
		int right = getTreeHeight(root.right);
		
		if(left>right) {
			return left+1;
		} else {
			return right+1;
		}
	}
}
