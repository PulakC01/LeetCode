class Solution {
public:
    int triangularSum(vector<int>& nums) {
        vector<vector<int>> ans;
        ans.push_back(nums);
        for(int i=1;i<nums.size();i++) {
            vector<int> row(nums.size()-i);
            for(int j=0;j<nums.size()-i;j++) {
                row[j] = (ans[i-1][j] + ans[i-1][j+1])%10;
            }
            ans.push_back(row);
        }
        return ans[nums.size()-1][0];
    }
};