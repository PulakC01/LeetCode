class Solution {
public:
    int triangularSum(vector<int>& nums) {
        int currSize = nums.size();
        while(currSize>1) {
            for(int i=0;i<currSize-1;i++) {
                nums[i] = (nums[i]+nums[i+1])%10;
            }
            currSize--;
        }
        return nums[0];
    }
};