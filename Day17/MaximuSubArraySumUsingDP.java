package Day17;

public class MaximuSubArraySumUsingDP {

    public int maxSubArray(int[] nums) {
       int n = nums.length;
       if (n==1) return nums[0];
       int[] dp = new int[n];
       dp[0] = nums[0];
        int maxSum = nums[0];
       for (int i=1; i<n; i++){
        dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
        maxSum = Math.max(maxSum, dp[i]);
       }

       return maxSum;
    }
}