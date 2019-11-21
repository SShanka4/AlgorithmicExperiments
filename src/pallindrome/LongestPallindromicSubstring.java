package pallindrome;

import java.util.ArrayList;
import java.util.List;

public class LongestPallindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("a"));
	}
	
    public static String longestPalindrome(String s) {
        if(s.equals(null)||s.isEmpty()){
            return "";
        }
        int length = s.length();
        List<String> substrings = new ArrayList<String>();
        for(int i=0;i<length;i++){
            for(int grp=i;grp<length;grp++){
                StringBuilder subs = new StringBuilder();
                for(int j=i;j<=grp;j++){
                    subs.append(s.charAt(j));
                }
                substrings.add(subs.toString());
            }
        }
        String maxSubstring = "";
        int max=0;
        for(int i=0;i<substrings.size();i++){
            if(isPallindrome(substrings.get(i))){
                int lengthOfs = getLength(substrings.get(i));
                if(max<lengthOfs){
                    max=lengthOfs;
                    maxSubstring = substrings.get(i);
                }
            }
        }
        return maxSubstring;
    }
    
    private static boolean isPallindrome(String s){
        char[] chars = s.toCharArray();
        int i=0;
        int j=chars.length-1;
        while(i<j){
            if(chars[i]==chars[j]){
                i++;
                j--;
            } else{
                return false;
            }
        }
        return true;
    }
    
    private static int getLength(String s){
        return s.length();
    }

}
