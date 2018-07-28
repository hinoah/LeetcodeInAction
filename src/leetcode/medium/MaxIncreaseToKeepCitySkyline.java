package leetcode.medium;

/**
 * @link https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/7/27 下午4:47
 */
public class MaxIncreaseToKeepCitySkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        // 每行的 max 值
        int[] xMax = new int[grid.length];
        // 每列的 max 值
        int[] yMax = new int[grid[0].length];

        for (int x = 0; x < grid.length; x++) {
            xMax[x] = grid[x][0];
            yMax[x] = grid[0][x];
            for (int y = 0; y < grid[x].length; y++) {
                if (xMax[x] < grid[x][y]) {
                    xMax[x] = grid[x][y];
                }
                if (yMax[x] < grid[y][x]) {
                    yMax[x] = grid[y][x];
                }
            }
        }

        int increasement = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                // x行 和 y列的最大值比较取较小者则是 skyline
                int limit = xMax[x];
                if (xMax[x] > yMax[y]) {
                    limit = yMax[y];
                }
                increasement = increasement + limit - grid[x][y];
            }
        }
        return increasement;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        maxIncreaseKeepingSkyline(grid);
    }

}
