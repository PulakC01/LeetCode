class Solution {
public:
    double champagneTower(int poured, int query_row, int query_glass) {
        if(poured == 0) return 0;
        if(poured == 1) {
            if(query_row==0) return 1;
            else return 0;
        }
        vector<vector<double>> dp(query_row + 1, vector<double>(query_row + 1, 0));
        dp[0][0] = poured;
        for(int row = 0; row < query_row; row++) {
            for(int col = 0; col <= row; col++) {
                double excess = (dp[row][col] - 1) / 2.0;
                if(excess > 0) {
                    dp[row + 1][col] += excess;
                    dp[row + 1][col + 1] += excess;
                }
            }
        }
        return min(1.0, dp[query_row][query_glass]);
        
        
    }
};