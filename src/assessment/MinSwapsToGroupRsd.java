package assessment;

import java.util.ArrayList;
import java.util.List;

//given an array of red and white balls
//minimum number of swaps to group the red ones together
public class MinSwapsToGroupRsd {

	public static void main(String[] args) {
		System.out.println(getMinSwapsToGetRedTOgether("RWWRWWWR"));
	}

	private static int getMinSwapsToGetRedTOgether(String str) {
		int count = 0;
		int length = str.length();
		if(str==null||length==2) {
			return -1;
		}
		//to calculate number of w and r balls
		//get the positions of each r balls
		//get the mid position 
		//get the difference between no of red balls
		//to the distance of each red ball from mid
		List<Integer> positions = getPositionsOfRed(str);
		//calculate the mid of list
		int size = positions.size();
		int mid = size/2;
		//parse through the list

		//min swaps is difference between
		//distance of red from the mid
		//num of red balls
		for(int i=0;i<size;i++) {
			//get distance from the mid
			int distFromMid = Math.abs(positions.get(i)-positions.get(mid));
			//count no of rs in between
			int numOfRs = Math.abs(mid-i);
			//get the difference and add to sum
			count+= distFromMid-numOfRs;
		}
		return count;		
	}

	//get a list of all indexes of Red balls
	private static List<Integer> getPositionsOfRed(String str) {
		List<Integer> positions = new ArrayList<Integer>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='R') {
				positions.add(i);
			}
		}
		return positions;
	}

}
