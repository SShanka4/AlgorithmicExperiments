package assessment;

//check numbers in the array whose 
//both positive and negative numbers exist
public class PositiveAndNegativeValueExist {

	public static void main(String[] args) {
		int[] arr = {3,2,-1,5,-3};
		numberOfBipolarNums(arr);
	}

	private static int numberOfBipolarNums(int[] arr) {
		int count = 0;
		int length = arr.length;
		//validations
		if(length==1) {
			return 0;
		}
		int l=0;
		int r=length;
		//O(n)
		while(l<r) {
			int sum = arr[l]+arr[r];
			//if sum is 0 of left and right number 
			//increase count and move the pointer
			//right from left and left from right
			//else check if the sum is negative
			//then negative number is bigger and
			//move the left pointer to right
			// and vice versa.
			if(sum==0) {
				count++;
				l++;
				r--;
			} else if(sum<0) {
				l++;
			} else {
				r--;
			}
		}
		return count;
	}

}
