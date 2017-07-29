import static org.junit.Assert.*;

import org.junit.Test;

public class Solution9Test {

	@Test
	public void test() {
		Solution9 sol = new Solution9();
		
		assertEquals(true, sol.isPalindrome(11));
		assertEquals(true, sol.isPalindrome(111));
		assertEquals(true, sol.isPalindrome(1221));
	}

}
