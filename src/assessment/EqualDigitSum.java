package assessment;

import java.util.HashMap;
import java.util.Map;

public class EqualDigitSum {

	public static void main(String[] args) {
		int[] arr = {51,32,42};
		System.out.println(equalMaxSum(arr));
		System.out.println(equalMaxSumOptimized(arr));
	}
	
	//O(n2)
	public static int equalMaxSum(int[] arr) {
		int length = arr.length;
		if(length==1) {
			return -1;
		}
		Map<Integer,Integer> indexByDigitSum = new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++) {
			indexByDigitSum.put(i, digitSum(arr[i]));
		}
		
		int max = 0;
		boolean isSame = false;
		for(int i=0;i<length-1;i++) {
			int num = indexByDigitSum.get(i);
			for(int j=i+1;j<length;j++) {
				if(num==indexByDigitSum.get(j)) {
					int add = arr[i]+arr[j];
					if(add>max) {
						max=add;
					}
					isSame = true;
				}
			}
		}
		return isSame?max:-1;
	}
	
	//O(n)
	public static int equalMaxSumOptimized(int[] arr) {
		int length = arr.length;
		if(length==1) {
			return -1;
		}
		Map<Integer,Integer> indexByDigitSum = new HashMap<Integer,Integer>();
		int max = -1;
		for(int i=0;i<length;i++) {
		 int add = digitSum(arr[i]);
		 if(!indexByDigitSum.containsKey(add)) {
			 indexByDigitSum.put(add,arr[i]);
		 }else {
			 max = Math.max(max, (arr[i]+indexByDigitSum.get(add)));
			 indexByDigitSum.put(add,Math.max(arr[i], indexByDigitSum.get(add)));
		 }
		}
		return max;
	}
	
	//O(log K)
	private static int digitSum(int num) {
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			num = num/10;
			sum+=digit;
		}
		return sum;
	}

}
