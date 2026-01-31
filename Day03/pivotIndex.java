package Day03;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int lSum = 0;
        for (int i = 0; i < n; i++) {
            if (lSum == totalSum - nums[i] - lSum) {
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}
