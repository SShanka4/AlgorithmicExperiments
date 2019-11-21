package sorting;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int[] arr = {45,-1,-9,43,21,2,5,3,9,22,0,-100,100,21};
		
		//bubble sort
		int[] sorted = BubbleSort.bubbleSort(arr);
		System.out.println("Sorted Array After Bubble sort=");
		Arrays.stream(sorted).forEach(System.out::println);
		
		//selection sort
		int[] setSorted = SelectionSort.selectionSort(arr);
		System.out.println("Sorted Array After Selection sort=");
		Arrays.stream(setSorted).forEach(System.out::println);
		
		//merge sort
		int[] mergeSorted = MergeSort.mergeSort(arr);
		System.out.println("Sorted Array After Merge sort=O(nlogn)");
		Arrays.stream(mergeSorted).forEach(System.out::println);
	}

}
