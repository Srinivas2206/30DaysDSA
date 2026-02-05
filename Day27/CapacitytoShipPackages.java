package Day27;

public class CapacitytoShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }
        int ans = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (canWeigh(weights, mid, days)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean canWeigh(int[] weights, int w, int days) {
        int n = weights.length;
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + weights[i] <= w) {
                sum += weights[i];
            } else {
                sum = weights[i];
                count++;
            }
        }

        return count <= days;
    }
}
