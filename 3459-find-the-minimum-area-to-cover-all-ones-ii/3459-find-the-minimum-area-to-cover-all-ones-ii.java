class Solution {
    private int minArea(int[][] grid, int si, int ei, int sj, int ej) {
        int minRow = Integer.MAX_VALUE, minCol = Integer.MAX_VALUE;
        int maxRow = -1, maxCol = -1;
        for (int i = si; i <= ei; i++) {
            for (int j = sj; j <= ej; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (maxRow == -1) return 0; // no 1s in this subgrid
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public int minimumSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = Integer.MAX_VALUE;

        // 1. Three horizontal stripes
        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                int a = minArea(grid, 0, i, 0, n - 1);
                int b = minArea(grid, i + 1, j, 0, n - 1);
                int c = minArea(grid, j + 1, m - 1, 0, n - 1);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);
            }
        }

        // 2. Three vertical stripes
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int a = minArea(grid, 0, m - 1, 0, i);
                int b = minArea(grid, 0, m - 1, i + 1, j);
                int c = minArea(grid, 0, m - 1, j + 1, n - 1);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);
            }
        }

        // 3. L-shapes (horizontal then vertical)
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                // top + bottom-left + bottom-right
                int a = minArea(grid, 0, i, 0, n - 1);
                int b = minArea(grid, i + 1, m - 1, 0, j);
                int c = minArea(grid, i + 1, m - 1, j + 1, n - 1);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);

                // bottom + top-left + top-right
                a = minArea(grid, i + 1, m - 1, 0, n - 1);
                b = minArea(grid, 0, i, 0, j);
                c = minArea(grid, 0, i, j + 1, n - 1);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);

                // left + top-right + bottom-right
                a = minArea(grid, 0, m - 1, 0, j);
                b = minArea(grid, 0, i, j + 1, n - 1);
                c = minArea(grid, i + 1, m - 1, j + 1, n - 1);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);

                // right + top-left + bottom-left
                a = minArea(grid, 0, m - 1, j + 1, n - 1);
                b = minArea(grid, 0, i, 0, j);
                c = minArea(grid, i + 1, m - 1, 0, j);
                if (a > 0 && b > 0 && c > 0) ans = Math.min(ans, a + b + c);
            }
        }

        return ans;
    }
}
