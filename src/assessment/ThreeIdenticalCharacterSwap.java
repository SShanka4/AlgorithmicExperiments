package assessment;

//we can swap 'a' with 'b' OR 'b' with 'a'
//string should only contain 'a' and 'b'
//calculate number of moves so that 
//there is no consecutive as or bs
public class ThreeIdenticalCharacterSwap {

	public static void main(String[] args) {
		System.out.println(calcuateNumberOfSwaps("bbaaaabababab"));
	}

	//O(n)
	private static int calcuateNumberOfSwaps(String str) {
		//validations
		if(str==null) {
			return -1;
		}
		int length = str.length();
		//if there is only one element in string then return 0
		if(length==1) {
			return 0;
		}
		//calculate consecutive number of as and bs
		int a=0,b=0,moves=0;;
		for(int i=0;i<length;i++) {
			if(str.charAt(i)=='a') {
				a++;
				b=0;
			} else {
				b++;
				a=0;
			}
			//if any of the a came consecutive thrice
			//there will be a move in that case
			//a and b counter should be reset
			if(a==3||b==3) {
				moves++;
				a=0;
				b=0;
			}
		}
		return moves;
	}

}
