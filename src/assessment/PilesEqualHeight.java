package assessment;

import java.util.Arrays;

public class PilesEqualHeight {

	public static void main(String[] args) {
		int[] arr = {5,4,3,3,2,1};
		System.out.println(minNoOfStepsToEqualHeight(arr));
	}

	private static int minNoOfStepsToEqualHeight(int[] arr) {
		int length = arr.length;
		int moves = 0;
		int maxIndex = 0;
		while(maxIndex<length) {
			//get the max index of the largest element 
			//where the next element is different
			maxIndex = getMaxIndex(arr);
			//replace the maximum number with its next number
			//which is just lower than the maximum number
			if(maxIndex!=length-1) {
				arr[maxIndex] = arr[++maxIndex];
				moves++;
			} else {
				break;
			}
			Arrays.stream(arr).forEach(System.out::print);
			System.out.println("\n");
		}
		return moves;
	}

	//method to return the min number in a sorted array
	private static int getMaxIndex(int[] arr) {
		int maxIndex=0;
		//loop from the first element
		//loop till the length of array
		//check if the next number is same
		//increment the index
		while(maxIndex<(arr.length-1)&&arr[maxIndex]==arr[maxIndex+1]) {
			maxIndex++;
		}
		return maxIndex;
	}

}
