package pallindrome;

//Class to check a string is pallindrome or not
//we should take care of the case e.g. lowercase
//Complexity: O(n/2)
public class SimplePallindrome {

	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(isPallindrome(str));
	}

	private static boolean isPallindrome(String str) {
		if(str==null||str.isEmpty()) return false;
		char[] chars = str.toLowerCase().toCharArray();
		int i=0;
		int j = str.length()-1;
		while(i<j) {
			if(chars[i]==chars[j]) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

}
