import static org.junit.Assert.*;

import org.junit.Test;

public class Solution12Test {

	@Test
	public void test() {
		Solution12 sol = new Solution12();
		
		assertEquals("MMM", sol.intToRoman(3000));
		assertEquals("MM", sol.intToRoman(2000));
		assertEquals("M", sol.intToRoman(1000));
	}

}
