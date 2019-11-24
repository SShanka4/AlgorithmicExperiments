package assessment;

public class MaxPossibleValueOnDigitInsertion {

	public static void main(String[] args) {
		System.out.println(getMaxValueAfterInsertion(599,4));
	}

	private static int getMaxValueAfterInsertion(int num, int insert) {
		StringBuilder str = new StringBuilder();
		//to check if a number is positive
		boolean isPositive = false;
		//to handle the last append number
		boolean isInserted = false;
		if(num>0) {
			isPositive = true;
		}
		if(num==0) {
			return (num*10);
		}
		//convert the number to string
		String numStr = num+"";
		//parse through each digit and check if it is greater or smaller
		for(int i=0;i<numStr.length()+1;i++) {
			//append at the last position
			if(i==numStr.length()) {
				str.append(isInserted?numStr.charAt(numStr.length()-1)
						:insert);
				break;
			}
			if(isPositive) {
				if(numStr.charAt(i)>=insert) {
					str.append(numStr.charAt(i));
				} else {
					str.append(insert);
					isInserted = true;
				}
			} else {
				if(numStr.charAt(i)<=insert) {
					str.append(numStr.charAt(i));
				} else {
					str.append(insert);
					isInserted= true;
				}
			}
		}
		return Integer.parseInt(str.toString());
	}

}
