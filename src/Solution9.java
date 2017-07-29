
public class Solution9 {
	public boolean isPalindrome(int x) {
		boolean result = true;
		
		if (x>=0 && x<10) return true;
		if (x < 0) return false;
		
		String number = String.valueOf(x);
		int numLen = number.length();
		int y = x;
		int fn;
		int ln;
		for (int i = 0; i<numLen/2; i++) {
			fn = Integer.parseInt(String.valueOf(number.charAt(i)));
			ln = y%10;
			y = y/10;
			if (fn != ln) return false;
		}
		
		return result;
	}
}
