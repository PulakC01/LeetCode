class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int target = -x;
        for(int i : nums)
            target+=i;
        
        if(target < 0)
            return -1;
        
        int j=0, sum=0, n=nums.size();
        int ans=INT_MIN;
        
        for(int i=0;i<n;i++) {
            sum += nums[i]; 
            while(sum > target) {
                sum -= nums[j];
                j++;
            }
            if(sum==target)
                ans=max(ans,i-j+1);
        }
        return ans == INT_MIN ? -1 : n-ans;
    }
};