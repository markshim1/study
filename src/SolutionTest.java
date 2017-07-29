import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		int[] nums = {3,2,5};
		int target = 5;
		
		int[] expectedResult = {3,2};
		int[] result = new int[2];
		
		result = solution.twoSum(nums, target);
		
		assertEquals(expectedResult[0], result[0]);
		assertEquals(expectedResult[1], result[1]);		
	}
}
