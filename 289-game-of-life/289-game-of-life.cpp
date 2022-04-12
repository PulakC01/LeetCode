class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        int n = board.size();
        int m = board[0].size();
        vector<vector<int>> ans(n);
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int ones = 0, zeros = 0;
                // upper left
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1)
                    ones++;
                else if(i-1>=0 && j-1>=0)
                    zeros++;
                // upper
                if(i-1>=0 && board[i-1][j]==1)
                    ones++;
                else if(i-1>=0)
                    zeros++;
                // upper right
                if(i-1>=0 && j+1<m && board[i-1][j+1]==1)
                    ones++;
                else if(i-1>=0 && j+1<m) 
                    zeros++;
                // right
                if(j+1<m && board[i][j+1]==1)
                    ones++;
                else if(j+1<m)
                    zeros++;
                // bottom right
                if(j+1<m && i+1<n && board[i+1][j+1]==1)
                    ones++;
                else if(j+1<m && i+1<n) 
                    zeros++;
                // bottom
                if(i+1<n && board[i+1][j]==1)
                    ones++;
                else if(i+1<n)
                    zeros++;
                // bottom left
                if(i+1<n && j-1>=0 && board[i+1][j-1]==1)
                    ones++;
                else if(i+1<n && j-1>=0) 
                    zeros++;
                // left
                if(j-1>=0 && board[i][j-1]==1)
                    ones++;
                else if(j-1>=0)
                    zeros++;
            
                
                if(board[i][j]==1) {
                    if(ones==2 || ones==3)
                        ans[i].push_back(1);
                    else
                        ans[i].push_back(0);
                }
                else {
                    if(ones==3)
                        ans[i].push_back(1);
                    else
                        ans[i].push_back(0);
                }
            }
        }
        board = ans;
    }
};