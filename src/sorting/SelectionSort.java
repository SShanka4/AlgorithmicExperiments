package sorting;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					minIndex = j;
				}
			}
		    int temp = arr[minIndex];
		    arr[minIndex] = arr[i];
		    arr[i] = temp;
		}
		return arr;
	}
}
