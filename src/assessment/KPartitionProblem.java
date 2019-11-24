package assessment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KPartitionProblem {

	public static void main(String[] args) {
		
	}
	
	public static boolean kPartition(int[] arr,int k){
		//If the sum of all nums is divisible by k then it is mathematically possible
		//then we divide the sum/k and find the k subsets
		
		//check the sum and length of array
		int sum = Arrays.stream(arr).sum();
		int length = arr.length;
		if(!(sum%k==0)) {
			
		} else {
			return true;
		}
		return true;
	}

}
