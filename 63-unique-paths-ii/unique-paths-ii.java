class Solution {

        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
        return 0;
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[i][j] == 1) {
                obstacleGrid[i][j] = 0; // Mark obstacles as 0
            } else {
                if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1; // Initialize top-left cell
                } else {
                    obstacleGrid[i][j] = (i > 0 ? obstacleGrid[i - 1][j] : 0) +
                                         (j > 0 ? obstacleGrid[i][j - 1] : 0);
                }
            }
        }
    }

    return obstacleGrid[m - 1][n - 1];
}



}
