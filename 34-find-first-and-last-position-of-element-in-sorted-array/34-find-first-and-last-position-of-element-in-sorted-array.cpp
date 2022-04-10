class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int start = 0, end = nums.size()-1;
        vector<int> ans(2,-1);
        while(start<=end) {
            if(nums[start]==target)
                ans[0]=start;
            else 
                start++;
            if(nums[end]==target)
                ans[1]=end;
            else
                end--;
            if(ans[0]!=-1 && ans[1]!=-1)
                break;
        }
        return ans;
    }
};