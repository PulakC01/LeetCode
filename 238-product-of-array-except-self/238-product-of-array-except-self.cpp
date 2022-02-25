class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        int right = 1, left = 1;
        for(int i=n-1;i>=0;i--) {
            ans[i] = right;
            right = right * nums[i];
        }
        for(int i=0;i<n;i++) {
            ans[i] = ans[i] * left;
            left = left * nums[i];
        }
        return ans;
    }
};