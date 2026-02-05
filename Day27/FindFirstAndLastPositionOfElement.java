package Day27;

public class FindFirstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int first = -1;
        int last = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        int[] res = new int[2];
        res[0] = first;
        res[1] = last;
        return res;
    }
}
