package Day05;

public class MaximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {

        int l = 0;
        int r = k - 1;
        double sum = 0;
        for (int i = l; i <= r; i++) {
            sum += nums[i];
        }
        double max_avg = sum / k;
        while (r < nums.length - 1) {
            sum = sum - nums[l++];
            sum = sum + nums[++r];
            max_avg = Math.max(max_avg, sum / k);
        }
        return max_avg;
    }
}
