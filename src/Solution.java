public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int totalNum = nums.length;
        int first, second;
        for (int i = 0 ; i < (totalNum-1); i++) {
            for (int j = i+1; j<totalNum; j++) {
                first = nums[i];
                second = nums[j];
                if (first + second == target) {
                	int[] result = new int[2];
                	result[0] = i;
                	result[1] = j;
                    return result;
                } 
            }
        }
        return null;
    }
}