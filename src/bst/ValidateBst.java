package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidateBst {
    static List<Integer> inorderTraversedList = new ArrayList<Integer>();
    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return false;
        } else if(root.left==null&&root.right==null) {
        	return false;
        }
        
        //Inorder traversal of the tree(lRr)
        List<Integer> inorderTraversal = inOrderTraversal(root);
        System.out.println(inorderTraversal);
        //check if the inorder traversal is sorted
        if(isSorted(inorderTraversal)) {
        	return true;
        }
        return false;
    }
    
    private static boolean isSorted(List<Integer> inorderTraversal) {
    	//??time complexity between two methods 
    	//1. sorting using Collections.sort and comparing
    	//2. sorting by comparing the successor in this case
    	//I will prefer the second method
    	int min = -1;
    	for (Integer value : inorderTraversal) {
			if(value<min) {
				return false;
			}
			min = value;
		}
		return true;
	}

	private static List<Integer> inOrderTraversal(TreeNode root){
        if(root==null){
            return Collections.emptyList();
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversedList.add(root.val);
        inOrderTraversal(root.right);
        return inorderTraversedList;
    }
    
    public static void main(String[] args) {
		/*
		 * TreeNode root = new TreeNode(2); root.left = new TreeNode(1);
		 * //root.left.left = new TreeNode(4); root.right = new TreeNode(3);
		 */
    	
    	TreeNode root = null;
    	System.out.println(isValidBST(root));
    	
    }
}
