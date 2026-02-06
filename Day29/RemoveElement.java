package Day29;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for (int num : nums) {
            if (num == val)
                count++;
        }
        int k = n - count;
        int l = 0, r = n - 1;
        while (l < k && r >= k) {
            if (nums[l] == val && nums[r] != val) {
                int temp = val;
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            while (nums[l] != val) {
                l++;
            }
            while (nums[r] == val) {
                r--;
            }
        }
        return k;
    }
}
