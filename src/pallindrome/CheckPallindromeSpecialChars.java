package pallindrome;

public class CheckPallindromeSpecialChars {

	public static void main(String[] args) {
		String str = "Ma12 da!!m";
		System.out.println(isPallindrome(str));
	}

	private static boolean isPallindrome(String str) {
		//validations
		if(str==null||str.isEmpty()) return false;
		//remove special characters and digits from string
		String consider = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		//System.out.println(consider);
		int i=0,j=consider.length()-1;
		while(i<j) {
			if(consider.charAt(i)==consider.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

}
