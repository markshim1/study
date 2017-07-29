import java.util.HashMap;
import java.util.Map;

public class Solution12 {
	Map<Integer, String> table;
	
	public String intToRoman(int num) {
		setTable();
        String result = "";
        
        int thousand = num/1000;
        System.out.format("thousand = %s \n" ,thousand);
        if (thousand > 0) {
        	if (thousand < 4) {
        		for (int i = 0 ; i<thousand; i++) {
        			result += table.get(1000);
        			System.out.format("result = %s\n", result);
        		}
        	}
        }
                
        return result;
    }
	

	
	private void setTable() {
		table = new HashMap<Integer, String>();
		table.put(1,  "I");
		table.put(5,  "V");
		table.put(10,  "X");
		table.put(50,  "L");
		table.put(100,  "C");
		table.put(500,  "D");
		table.put(1000,  "M");		
	}
}
