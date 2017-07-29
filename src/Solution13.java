import java.util.HashMap;
import java.util.Map;

public class Solution13 {
	Map<String, Integer> table;
	
	public Solution13() {
		setTable();
	}
		
	public int romanToInt(String s) {			
        int result = 0;
        int temp1, temp2;
        System.out.format("s len = %d \n", s.length());
        if (s != null) {
        	
	        	for (int i = 0; i<s.length(); i++) {
	        		temp1 = getNum(String.valueOf(s.charAt(i)));
	        		if (i+1 < s.length()) {
	        			temp2 = getNum(String.valueOf(s.charAt(i+1)));
	        			if (temp2 > temp1) {
	        				result += (temp2-temp1);
		        			i++;
	        			} else {
		        			result += temp1;
		        		}
	        		}
	        		else {
	        			result += temp1;
	        		}
	        		System.out.format("result = %d \n", result);
	        	}
        }
        return result;
    }
	
	
	private void setTable() {
		table = new HashMap<String, Integer>();
		table.put("I",  1);
		table.put("V" , 5);
		table.put("X", 10);
		table.put("L", 50);
		table.put("C", 100);
		table.put("D", 500);
		table.put("M", 1000);		
	}	
	
	private int getNum(String roman) {
		System.out.format("roman = %s \n", roman);
		if (roman != null) {
			return table.get(roman);
		}
		return 0;
	}
}
