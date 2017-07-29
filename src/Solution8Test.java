import static org.junit.Assert.*;

import org.junit.Test;

public class Solution8Test {

	@Test
	public void test() {
		Solution8 sol = new Solution8();
		assertEquals(2147483647, sol.myAtoi("9223372036854775809"));
		assertEquals(-2147483648, sol.myAtoi("-2147483648"));
	}

}
