package Day27;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int ans = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (canEat(piles, mid, h)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public boolean canEat(int[] piles, int speed, int h) {
        long hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed;
        }
        return hours <= h;
    }
}
