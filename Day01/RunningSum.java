public class RunningSum {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] rsum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            rsum[i] = sum;
        }
        return rsum;
    }
}
