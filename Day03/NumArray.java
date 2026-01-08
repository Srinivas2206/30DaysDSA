package Day03;

public class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        int n = nums.length;
        if (left == 0) {
            return nums[right];
        }
        return nums[right] - nums[left - 1];
    }

}
