package assessment;

public class MaxPossibleValueOnDigitInsertion {

	public static void main(String[] args) {
		System.out.println(getMaxValueInsert5(-599));
	}
	private static int getMaxValueInsert5(int num) {
		boolean isPositive = false;
		//to handle the last append number
		boolean isInserted = false;
		if(num>=0) {
			isPositive = true;
		}
		if(num==0) {
			return (5*10);
		}
		String numStr = num+"";
		for(int i=0;i<numStr.length();i++) {
			if(!isPositive) {
				if(numStr.charAt(i)>'5')
				    return Integer.parseInt(numStr.substring(0,i)+'5'+numStr.substring(i));
			} else {
				if(numStr.charAt(i)< '5')
				    return Integer.parseInt(numStr.substring(0,i)+'5'+numStr.substring(i));
			}
		}
		return Integer.parseInt(numStr+'5');
	}
}
