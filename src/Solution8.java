public class Solution8 {
	public int myAtoi(String str) {
		long result = 0;
		boolean isNegative = false;
		boolean isPositive = false;
		if (str != null) {
			char c;
			String st;			
			int num = 0;
			boolean isNegativedone = false;
			
			for (int i =0 ; i<str.length(); i++) {
				c = str.charAt(i);
				st = String.valueOf(c);
				
				if (c == ' ') {
					if (isNegative || isPositive|| (num!=0)) {
						break;
					}
				} else if (c == '-') {
					
					if (isPositive || isNegative) break;
					isNegative = true;
							
				} else if (c=='+') {
					
					if (isPositive || isNegative) break;
					isPositive = true;
					
				}else {
					try {
						num = Integer.parseInt(st);
					} catch (Exception e) {
						System.out.format("Exception\n");
						break;
					}
					if (isNegativedone) {
						result = result - (result*2);
						isNegativedone = true;
					}
					if (isNegative) {						
						result = (result * 10) - num;
					} else {
						result = (result * 10) + num;
					}
					System.out.format("num is  %d \n", result);
				}
				if (result > Integer.MAX_VALUE) {
					result = Integer.MAX_VALUE;
					break;
				}
				if (result < Integer.MIN_VALUE) {
					result = Integer.MIN_VALUE;
					break;
				}
			}
			
			if (result > Integer.MAX_VALUE && isNegative==false) {
				return Integer.MAX_VALUE;
			}
		}
		
		System.out.format("num is  %d \n", result);
		
//		if (isNegative) {
//			result = result - (result*2);
//		}
		
		return (int)result;
    }
}