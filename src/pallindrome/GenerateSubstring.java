package pallindrome;

import java.util.ArrayList;
import java.util.List;

//class to generate list of substrings for a given String
public class GenerateSubstring {

	public static void main(String[] args) {
		String str = "Madam";
		generateSubstringBrute(str);
		generateSubstringBruteWithoutSubstring(str);
	}

	private static void generateSubstring(String str) {
		
	}

	//O(n3)
	private static void generateSubstringBrute(String str) {
		List<String> subs = new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				subs.add(str.substring(i, j));
			}
		}
		System.out.println(subs);
	}
	
	//O(n3)
	private static void generateSubstringBruteWithoutSubstring(String str) {
		List<String> subs = new ArrayList<String>();
		int length = str.length();
		//staring index
		for(int i=0;i<length;i++) {
			//ending index
			for(int grp=i;grp<length;grp++) {
				//print all the possibilities from start to end
				//print in terms of width starting with 1,2,3..
				//int width = 1
				StringBuilder substring = new StringBuilder();
				for(int k=i;k<=grp;k++) {
					System.out.print(str.charAt(k));
					substring.append(str.charAt(k));
					//subs.add();
				}
				subs.add(substring.toString());
			}
		}
		System.out.println(subs);
	}

}
