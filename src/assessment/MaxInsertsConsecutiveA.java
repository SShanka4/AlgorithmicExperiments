package assessment;

import java.util.Stack;

//get the maximum inserts of as in a given string
//so that the resultant string will not have three consecutive as
public class MaxInsertsConsecutiveA {

	private static final String TWO = "aa"; 
	private static final String ONE = "a"; 
	
	public static void main(String[] args) {
		System.out.println(getMaxInsertsOfAs("aababa"));
	}

	private static int getMaxInsertsOfAs(String str) {
		int maxInserts=0;
		int count = 0;
		if(str==null) {
			return -1;
		}
		//Initializing conditions
		char[] toArray = str.toCharArray();
		int length = str.length();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder build = new StringBuilder();
		if(toArray[0]=='a') {
			stack.push(toArray[0]);
			build.append(toArray[0]);
			count++;
		} else {
			stack.push(toArray[0]);
			build.append(TWO);
			maxInserts+=2;
			build.append(toArray[0]);
		}
		
		for(int i=1;i<length;i++) {
			if(toArray[i]=='a'&&count<2) {
				stack.push(toArray[i]);
				build.append(ONE);
				maxInserts+=1;
				count++;
			}else if(toArray[i]=='a'&&count==2){
				stack.push(toArray[i]);
				count++;
			} else { //if anything apart from a comes
				//check the first element in stack if it is a
				char pop = stack.pop();
				//if its a but number of as are less than 2
				//then we could insert one a and append
				if(pop=='a'&&count<2) {
					stack.push(toArray[i]);
					build.append(ONE);
					maxInserts+=1;
					build.append(toArray[i]);
				} else if(pop=='a'&&count==2) {
					//if there are already two as in stack
					//just push and append the array's element
					stack.push(toArray[i]);
					build.append(toArray[i]);
				} else {
					//if there are no a in the stack
					//we can push teo as
					stack.push(toArray[i]);
					build.append(TWO);
					maxInserts+=2;
					build.append(toArray[i]);
				}
				//make count as 0 as no as are in top of stack
				count=0;
			}
			//if there are already three arrays
			//return -1
			if(count==3) {
				return -1;
			}
			//condition for the last element
			//we can append as at the end
			if(i==length-1) {
				if(stack.pop()!='a') {
					build.append(TWO);
					maxInserts+=2;
				} else {
					if(count==1) {
						build.append(ONE);
					} else {
						build.append(TWO);
					}
				}
			}
		}
		System.out.println(build.toString());
		return maxInserts;
	}

}
