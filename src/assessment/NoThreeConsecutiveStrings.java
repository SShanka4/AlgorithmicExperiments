package assessment;

import java.util.Stack;

public class NoThreeConsecutiveStrings {

	public static void main(String[] args) {
		System.out.println(getNumberOfDeletions("aaaabcccd"));
	}

	private static int getNumberOfDeletions(String str) {
		int count = 0;
		int deletions = 0;
		if(str==null) {
			return -1;
		}
		int length = str.length();
		if(length<3) {
			return 0;
		}
		//stringbuilder to store the new string
		StringBuilder build = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		//parse through each element in the string
		//check for consecutive ones
		stack.push(str.charAt(0));
		count++;
		for(int i=1;i<length;i++) {
			char ch = str.charAt(i);
			if(ch==stack.peek()) {
				count++;
			} else {
				count = 1;
			}
			if(count<3) {
				stack.push(ch);
			} else {
				deletions++;
			}
		}
		//print the new string without consecutive chars
		//since we used stack we need to print it in reverse order
		printReverseStack(stack);
		System.out.println(build.toString());
		return deletions;
	}

	private static void printReverseStack(Stack<Character> stack) {
		while(stack.isEmpty()) {
			return;
		}
		
		//pop the element from the stack and call recursively
		char ch = stack.pop();
		//idf stack is empty then print the last popped element
		if(stack.isEmpty()) {
			System.out.print(ch+"");
			return;
		}
		//xcall recursively
		printReverseStack(stack);
		//print each item from last popped element
		//recursively last item popped will be print first
		System.out.print(ch+"");
		
	}

}
