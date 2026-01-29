package Day06;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < n; i++) {
            curr_sum = Math.max(curr_sum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}