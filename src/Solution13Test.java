import static org.junit.Assert.*;

import org.junit.Test;

public class Solution13Test {
	@Test
	public void test() {
		Solution13 sol = new Solution13();
		assertEquals(1, sol.romanToInt("I"));
		assertEquals(2, sol.romanToInt("II"));
		assertEquals(4, sol.romanToInt("IV"));
		assertEquals(90, sol.romanToInt("XC"));
		assertEquals(120, sol.romanToInt("CXX"));
		assertEquals(109, sol.romanToInt("CIX"));
		assertEquals(3607, sol.romanToInt("MMMDCVII"));
	}

}
