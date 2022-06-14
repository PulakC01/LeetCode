class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int count = 0, limit = 0;
        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if(j < limit)
                    break;
                if(grid[i][j] < 0)
                    count++;
                else
                    limit = j;
            }
        }
        return count;
    }
};