package maximumsubarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int minSum = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum - minSum);
            minSum = Math.min(minSum, sum);
        }

        return maxSum;
    }

}
