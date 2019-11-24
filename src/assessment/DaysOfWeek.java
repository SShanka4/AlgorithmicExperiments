package assessment;

import java.util.HashMap;
import java.util.Map;

public class DaysOfWeek {

	public static void main(String[] args) {
		System.out.println(whatDayItIs("Sat",23));
	}

	private static String whatDayItIs(String str, int num) {
		final Map<String,Integer> noAssignedToDay =getDayNumAssignedMap();
		int daysInAWeek = 7;
		//divide the num by days in a week
		//get the remainder and add it to the given day number
		int daysAfter = num%7;
		//the sum of day numbers should not be greater than 7
		//since if we add any nu, to Sat it will be more than 7
		//which cannot be found in the hashmap
		int dayNum = (noAssignedToDay.get(str)+daysAfter)%7;
		//parse through the map to get the day which is key
		for(Map.Entry<String, Integer> entry:noAssignedToDay.entrySet()) {
			if(entry.getValue()==dayNum) {
				return entry.getKey();
			}
		}
		return str;
	}

	//assigns each number to a day of a week
	private static Map<String, Integer> getDayNumAssignedMap() {
		final Map<String,Integer> noAssignedToDay = new HashMap<String, Integer>();
		noAssignedToDay.put("Sun", 0);
		noAssignedToDay.put("Mon", 1);
		noAssignedToDay.put("Tue", 2);
		noAssignedToDay.put("Wed", 3);
		noAssignedToDay.put("Thu", 4);
		noAssignedToDay.put("Fri", 5);
		noAssignedToDay.put("Sat", 6);
		return noAssignedToDay;
	}

}
