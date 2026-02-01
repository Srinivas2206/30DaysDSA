package Day19;

import java.util.Arrays;

public class MinimumNoOfArrowsToBurstBalloon {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int lastEnd = points[0][1];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (lastEnd >= points[i][0]) {

            } else {
                lastEnd = points[i][1];
                count++;
            }
        }

        return count;
    }
}
