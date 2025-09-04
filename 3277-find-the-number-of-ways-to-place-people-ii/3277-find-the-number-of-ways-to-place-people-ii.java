import java.util.*;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int ans = 0;

        // Sort by x ascending, y descending
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        for (int i = 0; i < n; i++) {
            int ax = points[i][0], ay = points[i][1];
            for (int j = i + 1; j < n; j++) {
                int bx = points[j][0], by = points[j][1];

                if (ax <= bx && ay >= by) {
                    boolean ok = true;
                    for (int k = i + 1; k < j; k++) {
                        int x = points[k][0], y = points[k][1];
                        if (ax <= x && x <= bx && by <= y && y <= ay) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) ans++;
                }
            }
        }

        return ans;
    }
}
