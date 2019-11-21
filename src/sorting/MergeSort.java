package sorting;

//Divide and conquer algorithm
//O(nlogn)
//recursive call to divide into nodes
public class MergeSort {
	
	public static int[] mergeSort(int[] arr) {
		int length = arr.length;
		//restricting condition for recursion
		//plus one element should not be broken down further
		//return empty array if there is only one element left
		if(length<2) {
			int emptyArray[] = {};
			return emptyArray;
		}
		//get the middle value to divide the main array into two halves
		int mid = length/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[length-mid];
		
		//add elements to left and right array
		for(int i=0;i<mid;i++) {
			leftArray[i]=arr[i];
		}
		for(int i=mid;i<length;i++) {
			rightArray[i-mid]=arr[i];
		}
		//recursively divide left and right subtree
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		//call merge for left and right array
		int[] sortedArray = merge(arr,leftArray,rightArray);
		return sortedArray;
	}

	private static int[] merge(int[] arr, int[] leftArray, int[] rightArray) {
		//Counter for left array
		int i=0;
		//counter for right array
		int j=0;
		//counter for the main sorted array
		int k=0;
		//compare till the length of left Array and right Array
		while(i<leftArray.length&&j<rightArray.length) {
			//determine which element to merge first to the gonna be sorted array
			if(leftArray[i]<rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			} else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		return arr;
	}
}
